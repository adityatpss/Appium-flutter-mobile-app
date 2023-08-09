package gusi_Test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.testsigma.flutter.FlutterElement;
//import com.testsigma.flutter.FlutterFinder;

public class LoginGusi extends com.gusi.base.TestBase {

	//FlutterFinder find = new FlutterFinder(driver);

	@Test
	public void login() throws MalformedURLException, Exception{

		//test case id 1

		com.gusi.util.Gusi_Take_Screenshot sc = new com.gusi.util.Gusi_Take_Screenshot();
		sc.take_Screenshot();
		System.out.println("Verify that splash screen is showing after opening app");

		//testcase id 2 

		driver.findElement(By.xpath("")).click();     
		System.out.println("Verify that when user clicks on the  register link ");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);

		//testcase id 3

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("user@yopmailcom");   
		System.out.println("username is added");

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys("user@yopmailcom");   
		System.out.println("Password is added");

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"ENTER\"]")).click();   
		System.out.println("Loged in");

		Assert.assertEquals("Actual", "expected");

		Thread.sleep(3000);


		System.out.println("Verify that when user enters the unique Username,Email Address and valid password and confirm password.");

		//com.gusi.util.Gusi_Take_Screenshot sc = new com.gusi.util.Gusi_Take_Screenshot();

		sc.take_Screenshot();

		//test case id 4 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify when entering the Email Address and leave the Password blank .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 5 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the valid Password and leave the Email Address blank.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 6 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify when user enters the invalid Email Address and valid Password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 7 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the valid Email Address and invalid Password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 8 
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when enter the invalid Email  Address and invalid Password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 9

		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify Password added by the user should be encrypted and shown in an asterisk(***).");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 10
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that when user enters the valid Email Address and valid Password.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//test case id 11

		driver.findElement(By.xpath("")).click();		
		System.out.println("Verify that the user is able to click on the forgot password link .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);


		/*FlutterElement txt_email = find.byValueKey("Username");
		FlutterElement txt_password = find.byValueKey("Password");

		FlutterElement button_login = find.byValueKey("ENTER");

        txt_email.sendKeys("user@yopmailcom");
        txt_password.sendKeys("123456");
        button_login.click();
		 */

	}
}