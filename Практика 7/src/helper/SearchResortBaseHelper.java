package helper;

import objects.Resort;

import org.openqa.selenium.By;

public class SearchResortBaseHelper extends HelperBase{
	
	public SearchResortBaseHelper(AppManager manager) {
		super(manager);
	}
	
	Resort resort = new Resort();
	
	public static String ACTIVITY_TYPE = "activity_type_id";
	public static String REGION = "region_id";
	public static String FIND_BUTTON = "(//input[@type='image'])[2]";
	  
    public void quitSearchResortBaseHelper() {
	    manager.getSearchResortBaseHelper().quit();
    }
    
    public void openHomePage() {
    	manager.getSearchResortBaseHelper().getHomePage();
    }
    
    public void clickLink(String link) {
    	manager.getSearchResortBaseHelper().click(By.linkText(link));
    }
    
    public void selectActivityType(String activityType) {
    	manager.getSearchResortBaseHelper().findElementAndSelectByVisibleText(By.id(ACTIVITY_TYPE), activityType);
    }
    
    public void selectRegion(String region) {
    	manager.getSearchResortBaseHelper().findElementAndSelectByVisibleText(By.id(REGION), region);
    }
    
    public void find() {
    	manager.getSearchResortBaseHelper().click(By.xpath(FIND_BUTTON));
    }
    
    public void selectResortBase(String resortBase) {
    	manager.getSearchResortBaseHelper().click(By.linkText(resortBase));
    }
    
    public void searchResortBase(Resort resort) {
    	manager.getSearchResortBaseHelper().click(By.linkText("Все сайты"));
    	manager.getSearchResortBaseHelper().clickLink(resort.getType());
    	manager.getSearchResortBaseHelper().selectActivityType(resort.getActivityType());
    	manager.getSearchResortBaseHelper().selectRegion(resort.getRegion());
    	manager.getSearchResortBaseHelper().find();
    	
    }

}
