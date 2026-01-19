package testngdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;			//___.poi.ss.___ -> spreadSheet 
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {
	
	public static Object[][] readExcelData(String filePath, String sheetName) throws IOException {
		File file = new File(filePath);
		FileInputStream inputStream = new FileInputStream(file);	//(file) throws FileNotFoundException which is propagated
		
		Workbook wb = new XSSFWorkbook(inputStream);				//(inputStream) throws IOException which is propagated
		Sheet sheet = wb.getSheet(sheetName);
		
		int totalRows = sheet.getLastRowNum();		// first/header row is indexed as 0 ; header row is not considered
		System.out.println(totalRows);
		
		int totalCols = sheet.getRow(0).getLastCellNum();   //header row will have max columns
		System.out.println(totalCols);
		
		Object[][] data = new Object[totalRows][totalCols];
		
//		data[rowIndex][colIndex] = sheet.getRow(rowIndex+1).getCell(colIndex)   ----> returns cell object
//		data[rowIndex][colIndex] = sheet.getRow(rowIndex+1).getCell(colIndex).getStringCellValue()   ----> returns string cell value which is given through @DataProvider
//		data[0][0] = sheet.getRow(1).getCell(0);
//		data[0][1] = sheet.getRow(1).getCell(1);
		
		for(int rowIndex = 0 ; rowIndex < totalRows ; rowIndex++) {
			for(int colIndex = 0 ; colIndex < totalCols ; colIndex++ ) {
				Cell cell = sheet.getRow(rowIndex+1).getCell(colIndex);
				data[rowIndex][colIndex] = cell.getStringCellValue();			//String value for data provider
				System.out.print(data[rowIndex][colIndex] + " ");
				}
			System.out.println();
			}
		
		return data;
		}
	
	
//	public static void main(String[] args) throws IOException {
//		ExcelOperations.readExcelData(".//test-data/LoginData.xlsx","data");
//	}
	
}
