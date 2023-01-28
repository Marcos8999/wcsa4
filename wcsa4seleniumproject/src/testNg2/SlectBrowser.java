package testNg2;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class SlectBrowser {
	
  static WebDriver driver;
  @Test
  @Parameters ({"browserValue", "url"})
  public void openBrowser(String browservalue) {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(browservalue);
  }
}
