package url;

import java.io.UnsupportedEncodingException;

public class UrlDemo {
	public static void main(String[] args) {
		String str = "(%)";
		String decodeStr;
		try {
			decodeStr = java.net.URLDecoder.decode(str, "UTF-8");
			decodeStr = java.net.URLDecoder.decode(decodeStr, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
