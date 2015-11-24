package exception;

/**
 * try...catch 每个catch下的变量名可以一样
 * 
 */
public class TryDemo3 {
	public static void main(String[] args) {

	}

	public static void catchMethod() throws Exception {
		try {

		} catch (RuntimeException ex) {
			throw ex;
		} catch (Error ex) {
			throw ex;
		} catch (Exception ex) {
			throw ex;
		}
	}
}
