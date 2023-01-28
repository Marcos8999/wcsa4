package assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("file:///D:/Html/multiple.html");
        WebElement dropDownWebElement = driver.findElement(By.id("menu"));
        Select sel = new Select(dropDownWebElement);
        
        List<WebElement> allOption = sel.getOptions();
        
        TreeSet<String> s = new TreeSet<String>();
		for(int i=0;i<allOption.size();i++)
        {
			WebElement allopts1=allOption.get(i);
			String value = allopts1.getText();
			
			s.add(value);
        }
		
		for(String option:s)
		{
			System.out.println(option);
		}

	}

}
