package system;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RuntimeDemo {
	public static void main(String[] args) throws Exception {
		Process proc = Runtime.getRuntime().exec("ping www.baidu.com -t");
		InputStream in = proc.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in, "GBK"));

		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
