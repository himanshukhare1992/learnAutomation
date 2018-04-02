package excelSheetOperations;

public class Handle_ExceptionMessage {

	public static void main(String[] args) {

		try {
			int i = 10;
			int result = i / 0;
			System.out.println(result);
		}

		catch (Exception e) {
			String e1 = e.getMessage();
			System.out.println("Exception Occured !\n\n");
			if (e1.contains("by zero")) {
				System.out.println(
						"EXCEPTION REASON -> Somewhere Denominator value is 0. Please, change the Demominator value to avoid Exception.");
			}

		}

	}
}
