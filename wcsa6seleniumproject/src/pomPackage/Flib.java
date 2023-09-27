package pomPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	//read data from excel file
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
	  
		//write data into excel file
		public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount, String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath); //provide the path of the file which we want to work with
			Workbook wb = WorkbookFactory.create(fis);  //make the file ready to read
			Sheet sheet = wb.getSheet(sheetName);  //provide sheetName
			Row row = sheet.getRow(rowCount); 
			Cell cell = row.createCell(cellCount);                                                                
			cell.setCellValue(data);
		}
		
		//get the rowCount from the file
		public int getLastRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath); //provide the path of the file which we want to work with
			Workbook wb = WorkbookFactory.create(fis);  //make the file ready to read
			Sheet sheet = wb.getSheet(sheetName);
			int rc = sheet.getLastRowNum();
			return rc;
		}
		
		//read the property data
		public String readPropertyData(String propPath, String key) throws IOException
		{
			FileInputStream fis = new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fis);
			String data = prop.getProperty(key);
			return data;
		}

}
