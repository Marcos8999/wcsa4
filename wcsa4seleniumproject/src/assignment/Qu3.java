package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String PH = driver.getWindowHandle();
		System.out.println(PH);
		System.out.println("********************************************");
		
		Set<String> allHandels = driver.getWindowHandles();
		for(String Wh:allHandels)
		{
			System.out.println(Wh);
			if(!PH.equals(Wh))
			{
				driver.switchTo().window(Wh).close();
			}
			else
			{
				
			}
		}
	}

}
