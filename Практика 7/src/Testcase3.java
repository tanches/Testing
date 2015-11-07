import static org.junit.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import driver.MyWebDriver;

public class Testcase3 {
	
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
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElementAndClick(By.linkText("Филиалы"));
    driver.findElementAndSelectByVisibleText(By.id("type_id"), "все");
    driver.findElementAndSelectByVisibleText(By.id("country_id"), "Россия");
    driver.findElementAndSelectByVisibleText(By.id("region_id"), "Республика Татарстан (Татарстан)");
    driver.findElementAndClick(By.xpath("(//input[@type='image'])[2]"));
    driver.findElementAndClick(By.linkText("Вокзал города Казань"));
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
