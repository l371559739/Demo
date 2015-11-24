package exception;

public class TryDemo4 {
	public static void main(String... args) {
		System.out.println(getValue1());
		System.out.println(getValue2());
		System.out.println(getValue3());
	}

	public static int getValue1() {
		int i1 = 0;
		int i2 = 1;
		try {
			return i1;
		} finally {
			return i2;
		}
	}

	public static int getValue2() {
		int i = 1;
		try {
			i += 2;
			return i;
		} finally {
			i++;
		}
	}

	public static int getValue3() {
		int i = 1;
		try {
			int a = 1 / 0;
			return i;
		} catch (Exception e) {
			return i;
		} finally {
			return 2;
		}
	}
}
