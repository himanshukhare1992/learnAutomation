package autoIt;

import java.io.IOException;

import myUtilities.Common;

public class HandleWindowsAuthentication {

	public static void main(String[] args) throws InterruptedException, IOException {

		Common.LaunchFireFox("http://www.engprod-charter.net/");

		Thread.sleep(2000);

		Runtime.getRuntime().exec("C:\\Users\\SONY\\Desktop\\AutoIt Files\\Handle_WindowAuthentication.exe");

	}

}
