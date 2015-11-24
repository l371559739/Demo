package jdbc;

public class JdbcDemo {

	public static void main(String[] args) {
		String paramString = "jdbc:oracle:thin:@192.168.6.14:1521:dbdev";
		System.out.println(paramString.indexOf(58, paramString.indexOf(58) + 1) + 1);
	}

}
