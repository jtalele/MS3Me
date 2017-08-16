package ms3me.app;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class multiplesOf37 {

public Object multiplesof37(int fNum, int lNum){
		
		//StringBuffer sb = new StringBuffer();
		JSONArray resultArray = new JSONArray();
		
		for(int counter=fNum; counter<=lNum;counter++)
		{
			JSONObject jsObject = new JSONObject();
			String result = "";
			if(counter%3==0 && counter%7==0)
			{
				//sb.append(counter + "- MS3 and ME, ");
				result = "MS3 and ME";
			}
			else if (counter%3==0)
			{
				//sb.append(counter + "- ME, ");
				result = "ME";
			}
			else if (counter%7==0)
			{
				//sb.append(counter + "- MS3, ");
				result = "MS3";
			}
			jsObject.put("number", counter);
			jsObject.put("converted", result);
			resultArray.add(jsObject);
		}
		System.out.print(resultArray.toJSONString());
		return resultArray.toJSONString();
		
		
	}
}
