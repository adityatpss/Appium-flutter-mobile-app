package com.gusi.test;

//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gusi.pages.LoginGusiPage;
//import com.gusi.util.ExcelReader;
import com.gusi.util.ExcelUtil;

public class LoginGusiTest extends com.gusi.base.TestBase{
	
	public static LoginGusiPage login;
	/*
	@Test
	public void loginTest() throws Exception {

		login = new LoginGusiPage(driver);
	
		// Set Excel file path and sheet name
	//	String excelFilePath = "C:\\Users\\tpss\\eclipse-workspace\\Gusi_Flutter_Framework\\testData\\loginTestData.xlsx";
		//String sheetName = "loginSheet";

		// loginPage.login(username, password);

		//login.verify_Login("james", "Password");
		
		
	@BeforeClass
	public static void initiateDrivers() {
		// Passing the driver as an argument to LoginPage_PF constructor 
		login = new LoginGusiPage(driver);
	}

	*/	
	
		@Test
		public void test_TC001_verifyAppLaunch() throws Exception {	
			
			login = new LoginGusiPage(driver);
			//Thread.sleep(3000);
		
			ExcelUtil eu = new ExcelUtil();
			
			String username = eu.ReadCellData(1, 0);
			System.out.println(eu.ReadCellData(1, 0));	
			
			String password = eu.ReadCellData(1, 1);
			System.out.println(eu.ReadCellData(1, 1));
			
			login.typeName(username);
			login.typePassword(password);
			login.clickLogin();
		}

	}
//}



