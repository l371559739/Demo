package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxDemo {
	public static void main(String[] args) {
		String appcom, urlcfg, result;

		// String url =
		// "/com/idap.ITakeOrderComponent.queryOutputCol.json?takeOrderId=1";
		String url = "/app/collab.ICampaignSpecService.findValidStepState.json";
		// String url =
		// "/app/collab.ICampaignSpecService.campaignGuide!campaign/campaign_guide.htm?campaignTypeId=1&businessProcessId=1";
		Pattern pattern = Pattern.compile("/?(com|app)/{1}([\\.\\w]*)!{0,1}([/\\w]*(\\.htm|\\.json))");
		Matcher isNum = pattern.matcher(url);
		if (isNum.matches()) {
			appcom = pattern.matcher(url).replaceAll("$1");
			urlcfg = pattern.matcher(url).replaceAll("$2");
			result = pattern.matcher(url).replaceAll("$3");

			System.out.println(appcom);
			System.out.println(urlcfg);
			System.out.println(result);
		} else {
			System.out.println("公用action的路径不符合规范:" + url);
		}
	}
}
