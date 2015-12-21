package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HelperBase {

	private WebDriver driver;
	protected final AppManager manager;
	public static String BASE_URL = "http://rzd.ru/";;
	
	public HelperBase (AppManager manager)
	{
		this.manager = manager;	
		driver = manager.getWebDriverHelper().getDriver();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver() {
		this.driver = new FirefoxDriver();
	}
	
	public void getHomePage() {
		driver.get(BASE_URL + "/");	
	}
	
	public WebElement click(By s) {
		WebElement webElement = driver.findElement(s);
		if (webElement != null) {
			webElement.click();
		}
		return null;
	}
	
	public WebElement fillField(By s, String keys) {
		WebElement webElement = driver.findElement(s);
		if (webElement != null) {
			webElement.clear();
			webElement.sendKeys(keys);
		}
		return null;
	}
	
	public WebElement findElementAndSelectByVisibleText(By s, String s1) {
		WebElement webElement = driver.findElement(s);
		if (webElement != null) {
			new Select(webElement).selectByVisibleText(s1);
		}
		return null;
	}
	
	public Options manage() {
		driver.manage();
		return null;
	}
	
	public void quit() {
		driver.quit();
	}
	
	public TargetLocator switchTo() {
		driver.switchTo();
		return null;
	}
}
