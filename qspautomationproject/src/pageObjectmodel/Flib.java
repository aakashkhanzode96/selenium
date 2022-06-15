package pageObjectmodel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	String readData(String ExcelPath,String sheetName,int rowc,int cellc) throws EncryptedDocumentException, IOException
	{
		FileInputStream Fils = new FileInputStream(ExcelPath);
		 Workbook wb = WorkbookFactory.create(Fils);
				   Sheet sh = wb.getSheet(sheetName);
				   Row row = sh.getRow(rowc);
				   Cell cell = row.getCell(cellc);
				   String data = cell.getStringCellValue();
				   return data;
				   
	}
	public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
	}

}
