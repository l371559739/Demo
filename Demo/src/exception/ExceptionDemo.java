package exception;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		System.out.println(returnDemo());
	}

	public static String returnDemo() throws Exception {
		try {
			int i = 1, j = 0;
			int a = i / j;
			System.out.println(a);
			return "成功";
		} catch (Exception e) {
			throw e;
			// return "失败";
		}
		// return "失败";
	}
}
