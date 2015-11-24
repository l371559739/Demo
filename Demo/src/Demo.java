public class Demo {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100000; i++) {
			println(i);
		}
	}

	public static void println(int i) throws Exception {
		System.out.println(i);
		Thread.sleep(1000);
	}

}
