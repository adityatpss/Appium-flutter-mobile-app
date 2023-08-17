package gusi_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Profile extends com.gusi.base.TestBase {

	@Test
	public void profile() throws Exception{ 

		//testcase id 1 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user clicks on My Profile the side menu should be redirected to the profile page without any error");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);


		//testcase id 2 

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user clicks on the back button ");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 3 

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user clicks on the camera icon which is showing profile image ");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 4

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that user is able to select the take photo option.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 5

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that user is able to select and choose from gallery .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);


		//testcase id 6

		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).clear();				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that if a user clear the first name or last name data and clicks  on the save button ");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);   

		//testcase id 7

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user clicks on the save button and leave the fields blank wheneven first /last name are not saved yet.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);   

		//testcase id 8

		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the first name and leaves the last name blank.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);   

		//testcase id 9

		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the last name and leave the First name blank.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);   

		//testcase id 10

		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the blank space and clicks on the save button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);   

		//testcase id 11

		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).isEnabled();		
		System.out.println("Verify that if a user trys to edit the email id.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);   

		//testcase id 12

		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify when user enters the valid first name and valid last name, and clicks on the save button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);   

		//testcase id 13
				
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user clicks on the update password navigation link");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);   


	}}
