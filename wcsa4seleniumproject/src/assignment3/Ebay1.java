package assignment3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.ebay.com/");
        
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Apple Watches");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement result = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']"));
		String res = result.getText();
		System.out.println(res);
		
		WebElement result10 = driver.findElement(By.xpath("(//div[@class='s-item__title'])[11]"));
		String res1 = result10.getText();
		System.out.println("10th product of list is : "+res1);
		
		List<WebElement> resultall = driver.findElements(By.xpath("//span[@role='heading']"));
		for(WebElement r:resultall)
		{
			System.out.println(r.getText());
		}
		
		driver.findElement(By.xpath("//a[@type='next']")).click();
		
		List<WebElement> resultall1 = driver.findElements(By.xpath("//span[@role='heading']"));
		for(WebElement r1:resultall1)
		{
			System.out.println(r1.getText());
		}
		
	}

}
