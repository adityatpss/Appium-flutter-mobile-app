package gusi_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Settings extends com.gusi.base.TestBase {


	@Test
	public void changePassword() throws Exception{ 

		//testcase id 1 

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user clicks on the Back button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 2

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when click on Reset button and leave the fields blank.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 3 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the entered password is encrypted.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 4
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the password visibility in a readable format.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 5
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the password visibility in a readable format.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 6
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enter the invalid old password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 7
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the password field accepts alphabets.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 8
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the password field accepts numbers.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 9
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the password field accepts the lowercase and uppercase alphabets.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 10
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the password field accepts special characters.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 11
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the progress bar for the password field is displaying or not by entering a New password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 12
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Check that when the user enters the New password it does not match to Confirm the password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);


		//test case id 13
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when the user enters a confirmed password it does not match to the new password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 14
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify the new password and confirm the password by entering the same value.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 15
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Check that when the user enters only the New password and leaves Confirm password field blank.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 16
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Check that when the user enters only the confirm password and leaves New password field blank.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 17
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when leaving the old password field blank and entering the valid new and confirmed password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 18
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when entering the valid old password and confirming the password by leaving the new password field blank.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 19
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when entering the valid old password and a new password by leaving the Confirm password field blank.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 20
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when entering the valid old password and leaving the New Password and Confirm password field blank.");
		Assert.assertEquals("Actual", "expected"); 
		Thread.sleep(3000);               

		//test case id 21
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when entering the valid old password and entering only the blank space in the new and confirmed password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);
 
		//test case id 22
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the user should not be allowed to change the password by entering blank values.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 23
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that whether the Change password functionality works by entering valid old passwords and matching new and confirmed passwords.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);



	}}
