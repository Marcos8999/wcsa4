package readXlexData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wf = WorkbookFactory.create(fis);
		Sheet sheet = wf.getSheet("validcreats");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		
		driver.get("http://desktop-blc2pf7/login.do");
		
		FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wf2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wf2.getSheet("validcreats");
		Row row2 = sheet2.getRow(1);
		Cell cell2 = row2.getCell(1);
		String password = cell2.getStringCellValue();
		
		driver.findElement(By.name("username")).sendKeys(username);
		
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.xpath("//a[.='Login']")).click();
	}

}
