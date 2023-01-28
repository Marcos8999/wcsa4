package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://www.bluestone.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.id("denyBtn")).click();
		 Thread.sleep(2000);
		 driver.switchTo().frame("fc_widget");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		 
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("marcos");
	}

}
