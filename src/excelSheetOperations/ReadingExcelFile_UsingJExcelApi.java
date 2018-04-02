package excelSheetOperations;

import java.io.File;
import jxl.Workbook;

public class ReadingExcelFile_UsingJExcelApi {

	public static void main(String[] args) throws Exception {

		File fis = new File("C:\\Users\\SONY\\Desktop\\MySeleneseWorkSpace\\Excel_Data\\SourceData_93Format.xls");

		System.out.println("Excel Located Successfully !");

		// calling 1 static method getWorkbook
		Workbook wb = Workbook.getWorkbook(fis);

		System.out.println("Workbook loaded Successfully !");

		// call the sheet using wb Object.
		// getCell will accept 2 arguments - 1st is Column & 2nd is Row

		String data00 = wb.getSheet("DATA").getCell(0, 0).getContents();
		System.out.println("Data at 0-0 is -> " + data00);

		String data01 = wb.getSheet("DATA").getCell(0, 1).getContents();
		System.out.println("Data at 0-0 is -> " + data01);

		// Let's say if you want to check how many Rows are there in Sheet
		// 'DATA'
		int totalRowCount = wb.getSheet("DATA").getRows();
		int totalColumnCount = wb.getSheet("DATA").getColumns();

		System.out.println("\nRowCount  = " + totalRowCount);
		System.out.println("ColumnCount  = " + totalColumnCount);

		/*
		 * for (int i = 0; i < totalRowCount; i++) { // here getCell(0) is for
		 * 1st Column which is fixed & 'i' is for Row which will increament by
		 * +1 till the TotalRowCount ie 4 String str =
		 * wb.getSheet("DATA").getCell(0, i).getContents(); System.out.println(
		 * "\nRecords at position 0"+i+" is "+str); }
		 */

		for (int row = 0; row < totalRowCount; row++) // OuterLoop runs 4 times
		{
			for (int col = 0; col < totalColumnCount; col++) // innerLoop runs 2
																// times
			{

				// System.out.println("|-----------------------------------------------|");
				String str = wb.getSheet("DATA").getCell(col, row).getContents();
				System.out.println("\nData at Column" + col + " & Row" + row + " is -> " + str);

			}

		}

	}
}
