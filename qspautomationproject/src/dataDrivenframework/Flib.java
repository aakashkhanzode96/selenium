package dataDrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readData(String ExcelPath,String sheetName,int rowc,int cellc) throws EncryptedDocumentException, IOException
	{
		FileInputStream Fils = new FileInputStream(ExcelPath);
		 Workbook wb = WorkbookFactory.create(Fils);
				   Sheet sh = wb.getSheet(sheetName);
				   Row row = sh.getRow(rowc);
				   Cell cell = row.getCell(cellc);
				   String data = cell.getStringCellValue();
				   return data;
				   
				  
	}
	
	public int getrowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream Fils = new FileInputStream(excelPath);
		 Workbook wb = WorkbookFactory.create(Fils);
				   Sheet sh = wb.getSheet(sheetName);
				   int rc = sh.getLastRowNum();
				return rc;
				
		
	}
	
	
	public void writeExcelData(String excelPath,String sheetName,int rowcount,int cellCount,String data) throws IOException
	{
		FileInputStream Fils = new FileInputStream(excelPath);
		 Workbook wb = WorkbookFactory.create(Fils);
				   Sheet sh = wb.getSheet(sheetName);
			 Row row = sh.getRow(rowcount);
			 
			 Cell cell = row.createCell(cellCount);
			 cell.setCellValue(data);
			 
			FileOutputStream fos = new FileOutputStream(excelPath);
			wb.write(fos);
	}
}
