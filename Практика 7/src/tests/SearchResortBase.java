package tests;
import java.util.HashMap;

import helper.TestBase;
import objects.Resort;

import org.junit.Test;

public class SearchResortBase extends TestBase{
	
  @Test
  public void searchResortBase() throws Exception {
	  
	  Settings set = new Settings();
	  HashMap hashMap = set.settings();
	  for (int i = 1; i <= hashMap.size(); i++) {
		  app.getSearchResortBaseHelper().openHomePage();
		  Resort resort = new Resort();
		  HashMap<String, String> obj = (HashMap)hashMap.get(String.valueOf(i));
		  resort.setActivityType(obj.get("ActivityType"));
		  resort.setType(obj.get("Type"));
		  resort.setRegion(obj.get("Region"));
		  app.getSearchResortBaseHelper().searchResortBase(resort);
	  }
	
	//app.getSearchResortBaseHelper().clickLink((String)hashMap.get("Link"));
	
/*	app.getSearchResortBaseHelper().clickLink((String)hashMap.get("Type"));
	app.getSearchResortBaseHelper().selectActivityType((String)hashMap.get("ActivityType"));
	app.getSearchResortBaseHelper().selectRegion((String)hashMap.get("Region"));*/
	
	//app.getSearchResortBaseHelper().selectResortBase((String)hashMap.get("ResortBase"));
  }
  
  
}
