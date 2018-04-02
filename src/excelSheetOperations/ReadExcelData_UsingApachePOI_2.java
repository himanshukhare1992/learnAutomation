package excelSheetOperations;

import myUtilities.Common;

public class ReadExcelData_UsingApachePOI_2 {

	public static void main(String[] args) {
		Common.readExcel("C:\\Users\\SONY\\Desktop\\MySeleneseWorkSpace\\Excel_Data\\SourceData.xlsx");

		// pass sheetName with RowNo. & ColumnNo.
		String getData = Common.getData("xyz", 2, 1);

		System.out.println("Data Present in Sheet :>:>:> " + getData);

	}

}
