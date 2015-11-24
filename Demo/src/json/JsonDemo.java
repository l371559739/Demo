package json;

import net.sf.json.JSONObject;

public class JsonDemo {
	public static void main(String[] args) {
		JSONObject jsonObject = null;
		System.out.println(jsonObject.get("mktCampaignId").toString());
	}
}
