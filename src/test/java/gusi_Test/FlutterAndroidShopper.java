package gusi_Test;

import java.io.File;
import java.net.URL;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.testsigma.flutter.FlutterElement;
//import com.testsigma.flutter.FlutterFinder;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FlutterAndroidShopper {

	
	
	public void login1() throws Exception {
	
	System.out.println("Mobile App is launched");
	}
	
	 private AndroidDriver driver;
	   //private FlutterFinder find;

	   @BeforeTest
	   public void setUp() throws Exception {
	       DesiredCapabilities caps = new DesiredCapabilities();
	       caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
	       caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	       caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "3000");
	     //  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6 API"
	       	//	+ " 31");
	       caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a");
	       
	       //caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\tpss\\eclipse-workspace\\Gusi_Flutter_Framework\\flutterlogin-debug.apk");
	       
	       
	       caps.setCapability(MobileCapabilityType.APP, "/home/tpss/Desktop/Dummy_APK/app-debug.apk"); //mention your app path here
	       //caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\tpss\\Desktop\\GUSI\\Dummy_APK\\app-debug.apk"); //mention your app path here
	       
	       driver =  new AndroidDriver(new URL("http://192.168.1.76:4723/wd/hub"), caps);
	      // driver =  new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
	       
	      // find = new FlutterFinder(driver);
	       
	       caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "5000");
	       
	       System.out.println("Mobile 2 App is launched");
	   }
	   
	   
	   @Test
	   public void login() throws Exception {
		  
		   
		   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("user@yopmailcom");   
		   System.out.println("username is added");
		   
		   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys("user@yopmailcom");   
		   System.out.println("Password is added");
		   
		   driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"ENTER\"]")).click();   
		   System.out.println("Loged in");
		   
		   Thread.sleep(3000);
		   
		   //screenshot code
		  // String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		   try {	
				
				File screenshotFile = driver.getScreenshotAs(OutputType.FILE);
				Random random = new Random();      
				String screenshotPath = "C:\\Users\\tpss\\eclipse-workspace\\Gusi_Flutter_Framework\\test-output\\Screenshots\\screenshot1"+random.nextInt()+".png";
				
				File destinationFile = new File(screenshotPath);
				FileUtils.copyFile(screenshotFile, destinationFile);
				System.out.println("Screenshot saved at: " + screenshotPath);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		   /* 

		   FlutterElement txt_username = find.byValueKey("Username");
           FlutterElement txt_password = find.byValueKey("Password");
           FlutterElement button_login = find.byValueKey("ENTER");
           
           txt_username.sendKeys("user@yopmailcom");
           txt_password.sendKeys("123456");
           button_login.click();
	       */
	   }
	   
	  
	   
	 /* @AfterTest
	   public void tearDown(){
	       if(driver!=null){
	           driver.quit();
	       }
	       */
	   }
	
//}
