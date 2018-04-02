package excelSheetOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;

public class WriteData_IntoExcel {

	public static void main(String[] args) {

		// specify the file
		File myfile = new File("C:\\Users\\SONY\\Desktop\\MySeleneseWorkSpace\\Excel_Data\\SourceData.xlsx");

		try {
			FileInputStream fis = new FileInputStream(myfile);

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			XSSFSheet sheet = wb.getSheet("MyData");

			// At Row 0, using sheet Object, Create Cell at 3rd column & set new
			// Cell value in String
			sheet.getRow(0).createCell(2).setCellValue("Pass");
			sheet.getRow(1).createCell(3).setCellValue("Fail");

			// While reading we use FileInpurStream but while writing we need to
			// use FileOuputStream
			FileOutputStream fos = new FileOutputStream(myfile);

			// write the data into file(fos)
			wb.write(fos);

			// close the excel after Operation
			wb.close();

			System.out.println("Data has been written successfully into Sheet -> " + myfile);

		}

		catch (Exception e) {
			String e1 = e.getMessage();

			System.out.println("Exception Occured ->  " + e1 + "\n\n");

			if (e1.contains("The process cannot access the file because it is being used by another process")) {
				System.out.println(
						"EXCEPTION REASON -> ExcelSheet is currently open somewhere. So, Please close it or end it from Task Manager.");
			}
		}

	}

}
