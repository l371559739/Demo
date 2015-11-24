package httpserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.spi.HttpServerProvider;

@SuppressWarnings("restriction")
public class HttpServerDemo {
	public static void main(String[] args) throws IOException {
		HttpServerProvider provider = HttpServerProvider.provider();
		// 监听端口6666,能同时接受100个请求
		HttpServer httpserver = provider.createHttpServer(new InetSocketAddress(6666), 100);
		httpserver.createContext("/myApp", new HttpHandler() {
			public void handle(HttpExchange httpExchange) throws IOException {
				String responseMsg = "ok";
				InputStream in = httpExchange.getRequestBody(); // 获得输入流
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));
				String temp = null;
				while ((temp = reader.readLine()) != null) {
					System.out.println("client request:" + temp);
				}
				httpExchange.sendResponseHeaders(200, responseMsg.length());// 设置响应头属性及响应信息的长度
				OutputStream out = httpExchange.getResponseBody();
				out.write(responseMsg.getBytes());
				out.flush();
				httpExchange.close();
			}
		});
		httpserver.setExecutor(null);
		httpserver.start();
		System.out.println("server started");
	}
}
