package databaseConnecting;

import java.sql.Connection;
import java.sql.DriverManager;

import org.testng.annotations.Test;

public class DatabaseConnectionWithSQLServer 
{
	
	@Test
	public void TestDB() throws Exception
		{
		
		
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			Connection con = DriverManager.getConnection("jdbc:sqlserver://artOfTesting.com/selenium","sa", "1432");
			
			//Connection conn = DriverManager.getConnection("jdbc:sqlserver://artOfTesting.com/testDB","userName","password");
			
			
		}
	

}
