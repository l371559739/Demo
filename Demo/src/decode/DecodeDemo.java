package decode;

import java.io.UnsupportedEncodingException;

public class DecodeDemo {
	public static void main(String[] args) {
		/*
		 * String input = "http://www.altavista.com/cgi-bin/" +
		 * "qerry?pg=q&kl=XX&stype=stext&q=%2B%22Java+I%2FO%22&search.x=38&search.y=3"
		 * ; try { String output = java.net.URLDecoder.decode(input, "UTF-8");
		 * System.out.println(output); } catch (Exception e) {
		 * e.printStackTrace(); } finally { }
		 */

		// String str =
		// "select%2520t.demoid,%2520t.name,%2520t.age%2509from%2520demo_info%2520t,%2520menu_info%2520a%2520where%2520t.name=%2520'lrq'%2520and%2520t.demoid=a.menu_id(+)";
		String str = "(+)a.menu_id(+)";
		String decodeStr;
		try {
			decodeStr = java.net.URLDecoder.decode(str, "UTF-8");
			decodeStr = java.net.URLDecoder.decode(decodeStr, "UTF-8");
			String a = decodeStr.replace("( )", "(+)");
			System.out.println(a);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
