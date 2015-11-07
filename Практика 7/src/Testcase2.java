import static org.junit.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import driver.MyWebDriver;

public class Testcase2 {
	
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
  public void testCase2() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElementAndClick(By.linkText("��� �����"));
    driver.findElementAndClick(By.linkText("����� � �������"));
    driver.findElementAndSelectByVisibleText(By.id("activity_type_id"), "�����");
    driver.findElementAndSelectByVisibleText(By.id("region_id"), "������������� ����");
    driver.findElementAndClick(By.xpath("(//input[@type='image'])[2]"));
    driver.findElementAndClick(By.linkText("���� ������ \"�����������\""));
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
