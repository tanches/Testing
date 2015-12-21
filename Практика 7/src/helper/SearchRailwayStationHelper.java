package helper;

import org.openqa.selenium.By;

public class SearchRailwayStationHelper extends HelperBase{
	
	public SearchRailwayStationHelper(AppManager manager) {
		super(manager);
	}

	public static String TYPE = "type_id";
	public static String COUNTRY = "country_id";
	public static String REGION = "region_id";
	public static String FIND_BUTTON = "(//input[@type='image'])[2]";
	
  
    public void quitSearchRailwayStationHelper() {
    	manager.getSearchRailwayStationHelper().quit();
    }
    
    public void openHomePage() {
  	  manager.getSearchRailwayStationHelper().getHomePage();
    }
    
    public void clickLink(String link) {
    	manager.getSearchRailwayStationHelper().click(By.linkText(link));
    }
    
    public void selectType(String type) {
    	manager.getSearchRailwayStationHelper().findElementAndSelectByVisibleText(By.id(TYPE), type);
    }
    
    public void selectCountry(String country) {
    	manager.getSearchRailwayStationHelper().findElementAndSelectByVisibleText(By.id(COUNTRY), country);
    }
    
    public void selectRegion(String region) {
    	manager.getSearchRailwayStationHelper().findElementAndSelectByVisibleText(By.id(REGION), region);
    }
    
    public void find() {
    	manager.getSearchRailwayStationHelper().click(By.xpath(FIND_BUTTON));
    }

}
