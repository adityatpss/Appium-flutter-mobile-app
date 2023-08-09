package gusi_Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.testsigma.flutter.FlutterElement;
//import com.testsigma.flutter.FlutterFinder;

public class ForgotPassword extends com.gusi.base.TestBase {

	//FlutterFinder find = new FlutterFinder(driver);

	@Test
	public void forgotPassword() throws Exception{

		//testcase id 1 

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user clicks on the Back button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 2 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when  user clicks on the Send OTP button without entering any data into the field.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 3 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters data into the field .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 4 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when enters the invalid Registered Email Address.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 5 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when entering the valid Registered Email Address.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 6 

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the user clicks on the Back button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 7 

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the user clicks on the Back button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 8
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters an invalid 4-digit OTP code.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 12 

		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when clicks on Resend button that should be disabled until time runs out");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 13 
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user clicked the button again.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);



 



	}}
