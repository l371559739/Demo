package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxDemo1 {

	public static void main(String[] args) {
		System.out.println(dealParam("select * from a,b where a.id=b.id(+)"));
	}

	private static String dealParam(String param) {
		// 忽略所有换行符
		Pattern pattern = Pattern.compile("\n*");
		Matcher matcher = pattern.matcher(param);
		param = matcher.replaceAll("");
		// 忽略所有制表符
		pattern = Pattern.compile("\t*");
		matcher = pattern.matcher(param);
		param = matcher.replaceAll("");
		// 将连续多个空格符替换为一个空格符
		pattern = Pattern.compile(" {2,}");
		matcher = pattern.matcher(param);
		param = matcher.replaceAll(" ");
		return param;
	}

}
