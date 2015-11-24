package exception;

public class TryDemo2 {
	public static void main(String[] args) {
		System.out.println(ret());
	}

	public static String ret() {
		try {
			int a = 1 / 0;
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return "3";
		} finally {
			return "4";
		}
		// return "2";
	}
}
