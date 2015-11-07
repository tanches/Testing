package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyWebDriver {

	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver() {
		this.driver = new FirefoxDriver();
	}
	
	public void get(String s) {
		driver.get(s);	
	}
	
	public WebElement findElementAndClick(By s) {
		WebElement webElement = driver.findElement(s);
		if (webElement != null) {
			webElement.click();
		}
		return null;
	}
	
	public WebElement findElementAndClear(By s) {
		WebElement webElement = driver.findElement(s);
		if (webElement != null) {
			webElement.clear();
		}
		return null;
	}
	
	public WebElement findElementAndSendKeys(By s, String keys) {
		WebElement webElement = driver.findElement(s);
		if (webElement != null) {
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
