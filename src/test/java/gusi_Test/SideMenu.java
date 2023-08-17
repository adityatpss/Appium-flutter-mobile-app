package gusi_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SideMenu extends com.gusi.base.TestBase {

	@Test
	public void sideMenu() throws Exception{ 

		//testcase id 1 

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user clicks on the  Hamburger icon");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 2			
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that if a user wants to view the dashboard like ( my courses progress bar, users list , assignments ...) and clicks on the Dashboard.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 3 
		driver.findElement(By.xpath("")).click(); // For Hamburger icon
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that if a user wants to view the Q-Banks then user has to clicks on the Q-Bank menu to go to the page ");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 4
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that if a user wants to upload the Scans then user has to clicks on the My Scan menu.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 5
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that if a user wants to see the uploaded created exam and clicks on My Exam menu.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 6 
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that if a user wants to view all the courses/ lessons and clicks on My Courses menu.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 7 
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that a user wants to see all the notifications ( course updates booking confirmation) and clicks on the Notification menu.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 8 
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that if a user wants to view/ edit my profile and clicks on My Profile menu.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 9 
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that if a user wants to update the old password and clicks on the Change Password .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 10 
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user clicks on the Logout button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);



	}}
