package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	//it is used to store Generic Reusable methods
	//all the Generic methods are Non static
	
	//read the data from excel sheet
	public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); //provide the path of the file which we want to work with
		Workbook wb = WorkbookFactory.create(fis);  //make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);  //provide sheetName
		Row row = sheet.getRow(rowCount);  //get into the desire row
		Cell cell = row.getCell(cellCount);  // get into the desire cell
		String data = cell.getStringCellValue();  // use to read the value
		return data;
	}
	//write the data into excel sheet
	public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);  
		Sheet sheet = wb.getSheet(sheetName);  
		Row row = sheet.getRow(rowCount);  
		Cell cell = row.createCell(cellCount);                                                                
		cell.setCellValue(data);
	
	     FileOutputStream fos = new FileOutputStream(excelPath);
	     wb.write(fos);
	}
	 //Get the Last Row count from Excel Sheet 
    public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
    {
  	  FileInputStream fis = new FileInputStream(excelPath);
  	  Workbook wb = WorkbookFactory.create(fis);
  	  Sheet sheet = wb.getSheet(sheetName);
  	  int row = sheet.getLastRowNum();//it is use to get last count of row where we store the data
      return row;
    }
    
}