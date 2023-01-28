package assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1057265985%3A1672498567703194&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh7eHv1a1D7I4TU5XjhGXWbAffiIi9LZAoKHtF5SbI2IEun2rGGJUWZhHVmOJOBBmDbZnRpdyA");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ashishpatil8999@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//span[.='Next'][1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asus@8999",Keys.ENTER);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		

	}

}
