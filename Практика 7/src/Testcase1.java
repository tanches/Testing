import static org.junit.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import driver.MyWebDriver;

public class Testcase1 {
	
  private MyWebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new MyWebDriver();
    driver.setDriver();
    baseUrl = "http://rzd.ru/";
    driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCase1() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElementAndClear(By.id("name0"));
    driver.findElementAndSendKeys(By.id("name0"), " ¿«¿Õ‹ œ¿——");
    driver.findElementAndClick(By.cssSelector("div.station"));
    driver.findElementAndClear(By.id("name1"));
    driver.findElementAndSendKeys(By.id("name1"), "ÃŒ— ¬¿");
    driver.findElementAndClick(By.xpath("//div[7]/div[5]"));
    driver.findElementAndClick(By.id("buttonDate"));
    driver.findElementAndClick(By.xpath("//div[@id='popup_calendar']/div/div/div/div[2]/div/ul/li[24]/span"));
    driver.findElementAndClick(By.id("Submit"));
    driver.findElementAndClick(By.xpath("(//input[@type='radio'])[2]"));
    driver.findElementAndClick(By.id("continueButton"));
    driver.findElementAndClick(By.xpath("(//input[@type='radio'])[8]"));
    driver.findElementAndClick(By.id("continueButton"));
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
