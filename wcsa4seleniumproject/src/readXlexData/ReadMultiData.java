package readXlexData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultiData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		for(int i=1; i<=7; i++)
		{
		FileInputStream file = new FileInputStream("./data/test data.xlsx");
		Workbook wf = WorkbookFactory.create(file);
		Sheet sheet = wf.getSheet("IPL");
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		System.out.println(data);
	}
  }
}
