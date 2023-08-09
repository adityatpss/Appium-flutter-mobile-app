package gusi_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.testsigma.flutter.FlutterElement;
//import com.testsigma.flutter.FlutterFinder;


public class GusiRegister extends com.gusi.base.TestBase {

	//FlutterFinder find = new FlutterFinder(driver);

	@Test
	public void register() throws Exception {

		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Register\"]")).click();

		//testcase id 1 

		driver.findElement(By.xpath("")).click();     

		System.out.println("Verify that when user clicks on the  Login link ");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);

		//testcase id 2
		driver.findElement(By.xpath("")).click();		
		Assert.assertEquals("Actual", "expected");
		Assert.assertEquals("Actual", "expected");
		System.out.println("Verify that when user clicks on the Register button without entering the data in the fields");
		Thread.sleep(3000);

		//testcase id 3
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		Assert.assertEquals("Actual", "expected");
		System.out.println("Verify that when user enters the unique Username,Email Address and valid password and confirm password");
		Thread.sleep(3000);

		//testcase id 4 
		driver.findElement(By.xpath("")).sendKeys("");//enter existing username
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify if a user tries to register with an existing username");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 5 
		driver.findElement(By.xpath("")).sendKeys("");//enter Alphanumeric username
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the username Alphanumeric.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 6 
		driver.findElement(By.xpath("")).sendKeys("");//enter username which has space
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify whenever there is space in the username.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 7 
		driver.findElement(By.xpath("")).sendKeys("");//enter Unique username
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the Unique username.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//==============

		//testcase id 8 
		driver.findElement(By.xpath("")).sendKeys("");//enter existing Email Address
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when entering the existing Email Address.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 9 
		driver.findElement(By.xpath("")).sendKeys("");//enter Email Address in the incorrect format
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify Email Address is in the incorrect format");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);


		//testcase id 10 
		driver.findElement(By.xpath("")).sendKeys("");//enter valid Email address.
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the valid Email address.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 11 
		driver.findElement(By.xpath("")).sendKeys("");//entered password is encrypted or not
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the entered password is encrypted.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 12 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify the password visibility in a readable format.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);
		
		
		//=============
		//testcase id 13
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the password field accepts alphabets");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 14
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the password field accepts numbers");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 15
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the password field accepts the lowercase and uppercase alphabets");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 16
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the password field accepts special characters");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);
		//==========

		//testcase id 17 
		driver.findElement(By.xpath("")).sendKeys("");//enter invalid password
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify when user enter invalid password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 18 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Check that when the user enters the password it does not match to confirm the password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 19 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when the user enters a confirmed password it does not match to password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 20 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify the password and confirm the password by entering the same value.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 21 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Check that when the user enters only the password and leaves confirm password field blank.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 22 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Check that when the user enters only the confirm password and leaves password field blank.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//================

		//testcase id 23
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		Assert.assertEquals("Actual", "expected");
		System.out.println("Verify that when entering an existing user name");
		Thread.sleep(3000);		

		//testcase id 24
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		Assert.assertEquals("Actual", "expected");
		System.out.println("Verify that when user enters the Existing Email id");
		Thread.sleep(3000);


		//testcase id 25
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		Assert.assertEquals("Actual", "expected");
		System.out.println("Verify that when user already registered");
		Thread.sleep(3000);

		//testcase id 26
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		Assert.assertEquals("Actual", "expected");
		System.out.println("Verify that when user is deleted earlier and try to register with same email id");
		Thread.sleep(3000);















		/*
		FlutterElement txt_username = find.byValueKey("txt_username");
		FlutterElement txt_email = find.byValueKey("txt_email");
		FlutterElement txt_password = find.byValueKey("txt_password");
		FlutterElement confirm_password = find.byValueKey("confirm_password");
		FlutterElement button_register = find.byValueKey("button_register");

		txt_username.sendKeys("jack@12");
		txt_email.sendKeys("user@yopmailcom");
		txt_password.sendKeys("123456");
		confirm_password.sendKeys("123456");
		button_register.click();
		 */
	}

}
