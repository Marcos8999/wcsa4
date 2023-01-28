package assignment3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebay {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		driver.get("https://www.ebay.com/");
	    
		Actions act = new Actions(driver);
		Robot robot = new Robot();
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Apple Watch");
		driver.findElement(By.xpath("//select[@class='gh-sb ']")).click();
		for(int i=0;i<=20;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String allOption = driver.findElement(By.xpath("//span[.='Nylon Band Trail Loop For Apple Watch Ultra 38-49mm iWatch Series 8 7 6 SE 5 4']")).getText();
		for(int j=0;j<=10;j++)
		{
			System.out.println(allOption);
			Thread.sleep(j);
		}
	}

}
