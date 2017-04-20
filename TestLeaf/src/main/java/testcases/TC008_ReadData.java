package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TC008_ReadData {

	public static void main(String[] args) throws IOException {
		
		try{
		FileInputStream fis = new FileInputStream(new File("./data/TC008.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);	
		// get the number of rows
		int rowCount = sheet.getLastRowNum();
		// get the number of columns
		int columnCount = sheet.getRow(0).getLastCellNum();
		XSSFRow row = sheet.getRow(2);
		try{
			String cellValue = "";
			try{
				if(row.getCell(2).getCellType() == 1)
				cellValue = row.getCell(2).getStringCellValue();
				else if(row.getCell(2).getCellType() == 0)
				cellValue = ""+row.getCell(2).getNumericCellValue();
				
				System.out.println("2nd row -3rd column value is -->"+cellValue);	
				
			}catch(NullPointerException e){
				e.printStackTrace();
				System.out.println("Null pointer exception");
			}
		}catch (Exception e) {
				e.printStackTrace();
		}
		
		workbook.close();
		
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("Excel Not found");
			
		}
        catch(Exception e){
        	e.printStackTrace();
        	System.out.println("Exception");
			
		}

	}

}
