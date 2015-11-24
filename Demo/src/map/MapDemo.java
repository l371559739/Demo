package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public final static String INFO = "info";
	public final static String SUCCESS = "success";

	public static void main(String[] args) {
		// HashMap map = new HashMap();
		// System.out.println(map.get("resultId"));
		// map.remove("resultId");

		Map<String, Object> data = new HashMap<String, Object>();
		data.put(MapDemo.INFO, "Hello");
		// System.out.println(data.get(MapDemo.INFO));
		data.put(MapDemo.INFO, "Word");
		System.out.println(data.get(MapDemo.INFO));
		// data.put(MapDemo.INFO, "HAHA");
		// System.out.println(data.get(MapDemo.INFO));
	}
}
