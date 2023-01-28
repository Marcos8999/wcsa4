import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.selenium.dev/downloads/");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-2000)");
	}

}
