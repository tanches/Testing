package helper;
import objects.Route;

import org.openqa.selenium.By;

public class SearchTrainHelper extends HelperBase{
	
  public SearchTrainHelper(AppManager manager) {
		super(manager);
	}

  // ¿«¿Õ‹ œ¿——
  public static String KAZAN_PASS = "//div[6]/div[2]";
  //ÃŒ— ¬¿
  public static String MOSKOW = "//div[7]/div";
  
  Route route = new Route(KAZAN_PASS, MOSKOW);

  public static String TRAIN = "(//input[@type='radio'])[2]";
  public static String WAGON = "(//input[@type='radio'])[4]";
  public static String FIND = "Submit";
  public static String CONTINUE = "continueButton";
  
  public void quitSearchTrainHelper() {
	  manager.getSearchTrainHelper().quit();
  }
  
  public void openHomePage() {
	  manager.getSearchTrainHelper().getHomePage();
  }
  
  public void selectCityFrom(String city) {
	  manager.getSearchTrainHelper().fillField(By.id(route.getCityFromId()), city);
	  manager.getSearchTrainHelper().click(By.xpath(route.getCityFromSelect()));
  }
  
  public void selectCityTo(String city) {
	  manager.getSearchTrainHelper().fillField(By.id(route.getCityToId()), city);
	  manager.getSearchTrainHelper().click(By.xpath(route.getCityToSelect()));
  }
  
  public void find() {
	  manager.getSearchTrainHelper().click(By.id(FIND));
  }
  
  public void selectTrain() {
	  manager.getSearchTrainHelper().click(By.xpath(TRAIN));
  }
  
  public void selectWagon() {
	  manager.getSearchTrainHelper().click(By.xpath(TRAIN));
  }
  
  public void clickContinue() {
	  manager.getSearchTrainHelper().click(By.id(CONTINUE));
  }
	  
}
