package excelSheetOperations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData_UsingApachePOI {

	public static void main(String[] args) throws Exception {

		// specify the location of file
		File myFile = new File("C:\\Users\\SONY\\Desktop\\MySeleneseWorkSpace\\Excel_Data\\SourceData.xlsx");

		FileInputStream fis = new FileInputStream(myFile);

		// this is the Class which is coming from ApachePOI & this will load the
		// whole workBook
		// This total workbook will be loaded by this class XSSFWorkbook
		// NOTE: whenever you are dealing with .xlsx file, use XSSFWorkbook
		// class
		XSSFWorkbook workBook = new XSSFWorkbook(fis);

		// Use this class whenever you are working with .xls file
		// HSSFWorkbook workBook2 = new HSSFWorkbook(fis);

		// XSSFSheet sheet1 = workBook.getSheetAt(0); // here 0 means - it will
		// take 1st Sheet 'MyData' from above excelSheet

		XSSFSheet sheet1 = workBook.getSheet("Sheet2"); // here "Sheet2" means -
														// it will take Sheet
														// having name "Sheet2"
														// from above excelSheet

		// Whatever data is available at Row 0 & Column 0 will be loaded

		/*
		 * String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		 * System.out.println("Data from Excel at 0th Position  = "+data0);
		 * 
		 * String data1 = sheet1.getRow(1).getCell(0).getStringCellValue();
		 * System.out.println("Data from Excel at 0th Position  = "+data1);
		 * 
		 * String data2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		 * System.out.println("Data from Excel at 0th Position  = "+data2);
		 */

		// it will return the total row count
		int rowCount = sheet1.getLastRowNum();

		System.out.println("::::::::::Total Row Count::::::::: " + rowCount);

		for (int i = 0; i <= rowCount; i++) {
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();

			System.out.println("\n::::::Data at Position at " + i + " row is -> " + data);
		}

	}
}
