package clazz;

public class ClassDemo {
	public static void main(String[] args) {
		// System.out.println(C.class.getInterfaces());
		Class<?>[] interfaces = D.class.getInterfaces();
		System.out.println(interfaces[0]);
	}
}

interface A {
	int get();
}

interface B extends A {
}

interface C {
}

class D implements B, C {
	public int get() {
		return 0;
	}
}