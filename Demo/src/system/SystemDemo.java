package system;

import java.net.URL;

import sun.misc.Launcher;

public class SystemDemo {
	@SuppressWarnings("restriction")
	public static void main(String[] args) {
		/*
		 * long startTime = System.currentTimeMillis();// 获取当前时间 doSomeThing();
		 * long endTime = System.currentTimeMillis(); System.out.println(endTime
		 * - startTime);
		 */

		/* getSystemProperties(); */

		/*
		 * SystemDemo demo = new SystemDemo(); Class c = demo.getClass();
		 * ClassLoader loader = c.getClassLoader(); System.out.println(loader);
		 * System.out.println(loader.getParent());
		 * System.out.println(loader.getParent().getParent());
		 */

		URL[] urls = Launcher.getBootstrapClassPath().getURLs();
		for (URL url : urls) {
			System.out.println(url.toExternalForm());
		}
	}

	private static void doSomeThing() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}

	private static void getSystemProperties() {
		System.out.println(System.getProperties());
	}
}
