package exception;

public class TryDemo {
	// 只要是自己catch(捕捉了异常,这里的捕捉是指catch,不是指try),就不会向外抛出
	// try和finally连用(不加catch捕捉),这种写法可以达到的效果是,try里面的代码执行即使报错了,也会执行finally里面的代码,
	// 同时把错误抛出
	public static void main(String[] args) {
		try {// try1
			System.out.println("1");
			try {// try2
				System.out.println("2");
				int a = 1 / 0;
			}
			/*
			 * catch (Exception e) { System.out.println("5"); }// catch2
			 * 这里加不加这个catch对代码是有影响的:
			 * 
			 * 1、不加: 会执行finally代码,catch2会捕捉到异常
			 * 
			 * 2、加: 会执行finally代码,catch2不会捕捉到异常
			 */
			finally {
				System.out.println("3");
			}
		} catch (Exception ex) { // catch2
			System.out.println("4");
		}
	}
}
