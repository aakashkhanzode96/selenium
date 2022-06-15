package readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.chainsaw.Main;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Fils=new FileInputStream("./Data/TestData.xlsx");
		 Workbook wb=WorkbookFactory.create(Fils);
		 Sheet sh= wb.getSheet("Sheet1");
		Row rw=sh.getRow(1);
		Cell cell = rw.getCell(1);
		String data = cell.getStringCellValue();
		
		System.out.println(data);
		
	}
	
	

}
