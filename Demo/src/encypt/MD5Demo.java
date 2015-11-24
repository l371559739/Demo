package encypt;

import java.security.MessageDigest;

public class MD5Demo {
	public static void main(String[] args) throws Exception {
		/*
		 * MessageDigest m = MessageDigest.getInstance("MD5"); byte[] bt =
		 * "12345678".getBytes(); byte[] md5 = m.digest(bt); String md5Str = new
		 * String(md5, "UTF-8");
		 * 
		 * sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
		 * System.out.println(encoder.encode(md5));
		 * System.out.println(encoder.encode(md5Str.getBytes("UTF-8")));
		 */

		// System.out.println(encoder.encode(bt));
		//
		// sun.misc.BASE64Decoder dec = new sun.misc.BASE64Decoder();
		// System.out.println(new String(dec.decodeBuffer(encoder.encode(md5)),
		// "UTF-8"));

		String str = "b123456";
		MessageDigest digest = MessageDigest.getInstance("MD5");
		sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
		String encodedStr = new String(encoder.encodeBuffer(digest.digest(str.getBytes())));
		System.out.println(encodedStr.trim());

		String s = "fvYVbDL0J9cTFE9n4u8U0g==";
		sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
		String decodeStr = new String(decoder.decodeBuffer(s), "UTF-8");

		System.out.println(decodeStr);

	}
}
