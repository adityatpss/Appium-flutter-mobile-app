package gusi_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResetPassword extends com.gusi.base.TestBase {

	@Test
	public void resetPassword() throws Exception{ 

		//testcase id 1 

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user clicks on the Back button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 2

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when clicking on the Reset button without entering the data into fields");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 3 
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the New password and leave the confirm password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 4
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the confirmed password and leave the new password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 5 
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the first letter capital, a special character, a lowercase letter, and number .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 6 
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the Password length must be greater than 8 characters.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 7 
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user  enters the old password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 8
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the  valid  password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 9 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify enter when the new password and confirm the password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 10 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the new password and confirm the password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id  11
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the new password and confirm the password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);




	}	

}
