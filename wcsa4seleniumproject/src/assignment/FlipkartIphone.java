package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/account/?rd=0&link=home_account");
		
		//driver.findElement(By.xpath("//button[.='✕']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Iphone 14");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='CXW8mj'])[1]")).click();
		
		Set<String> childWindow = driver.getWindowHandles();
		for(String S:childWindow)
		{
			driver.switchTo().window(S);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[.='512 GB']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
	}

}
