package testNg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	
	static WebDriver driver;
  @BeforeMethod
  public void setUp(String browserValue) {
	  
	  if(browserValue.equals("chrome"))
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("http://desktop-blc2pf7/login.do");
  }
  
  @AfterMethod
  public void teardown()
  {
	  driver.quit();
  }
  
  
}
