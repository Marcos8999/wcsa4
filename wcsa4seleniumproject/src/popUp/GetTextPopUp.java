package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Html/Popup.html");
		
		WebElement button = driver.findElement(By.xpath("//button[.='Click me! ']"));
		button.click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		
		//al.accept();
		
		//al.dismiss();
		
		String alretText = al.getText();
		System.out.println("alretText");

	}

}
