package gusi_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SharedExam extends com.gusi.base.TestBase {

	@Test
	public void shared_exam() throws Exception{ 

		//testcase id 1 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that clicking on View button user can see the shared scans. ");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 2 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user clicks on the share button the pop-up box should be shown.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 3 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user enters the email id to share the exam with users and clicks on the share button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 4 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user clicks on the shared button and leaves the fields blanks .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 5 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify email settings functionality when no Checkboxes are selected and click on the Save Button");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 6 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when clicking on the download button the user can download the shared exam.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 7 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when clicking on the Exam Notes and click on Submit button  the user can write the exam notes");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		
		// need to add more test case and 2 test case should not be merge in one test case and sequnce no is wrong
		
		
		//testcase id 8 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 9 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);










































	}

}
