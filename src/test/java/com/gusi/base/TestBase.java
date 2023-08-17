package com.gusi.base;
 
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
//import java.util.Set;
//import java.util.Arrays;
import java.util.Properties;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;

public class TestBase {
	
	public static String appPtah = "/flutterlogin-debug.apk";
    public static AppiumDriver driver;
    public  ExtentReports extent;
    public ExtentTest logger;
    public static Properties envConfig;

  //  private String reportDirectory = "reports";
  //  private String reportFormat = "html";
   // private String testName = "Flutter Automation";
   // private String udid = "";
  //  private String deviceName = "";

    @BeforeClass
    public AppiumDriver setup () throws MalformedURLException {

        //File rootFile = new File("");
       // File appFile = new File(rootFile.getAbsolutePath() + appPtah);
        //appPtah = appFile.getAbsolutePath();
        DesiredCapabilities flutterCapabilities = new DesiredCapabilities();
        flutterCapabilities.setCapability( "deviceName", "Pixel_3a" );
        flutterCapabilities.setCapability( "platformName", "Android" );
       // flutterCapabilities.setCapability( "reportDirectory", reportDirectory );
       // flutterCapabilities.setCapability( "reportFormat", reportFormat );
       // flutterCapabilities.setCapability( "testName", testName );
        flutterCapabilities.setCapability("automationName", "UiAutomator2");
       // flutterCapabilities.setCapability("noReset", "true");
       // flutterCapabilities.setCapability("skipUnlock","true");
       // flutterCapabilities.setCapability("udid",udid);
        flutterCapabilities.setCapability("app", "/home/tpss/Desktop/Dummy_APK/app-debug.apk");
       // flutterCapabilities.setCapability("app", "C:\\Users\\tpss\\Desktop\\GUSI\\Dummy_APK\\app-debug.apk");
        driver = new AppiumDriver(new URL("http://192.168.1.76:4723/wd/hub"), flutterCapabilities);
       // driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), flutterCapabilities);
        return driver;
        
     
        
    }

    /*
    @AfterClass
    public void tearDown() throws MalformedURLException {
        driver.quit();
    }

   
    @BeforeTest
    public void startReport() {
        //ExtentReports(String filePath,Boolean replaceExisting)
        //filepath - path of the file, in .htm or .html format - path where your report needs to generate.
        //replaceExisting - Setting to overwrite (TRUE) the existing file or append to it
        //True (default): the file will be replaced with brand new markup, and all existing data will be lost. Use this option to create a brand new report
        //False: existing data will remain, new tests will be appended to the existing report. If the the supplied path does not exist, a new file will be created.
        extent = new ExtentReports("D:\\flutterappium\\test-output\\html\\extentReport.html", false);
        //extent.addSystemInfo("Environment","Environment Name")
        extent
                .addSystemInfo("Host Name", "Host Name")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "User123");
        //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
        //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
        extent.loadConfig(new File("D:\\flutterappium\\extent-config.xml"));
    }
    
    @AfterMethod
    public void getResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
            logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
        }
    }

    @AfterTest
    public void endReport(){
        // writing everything to document
        //flush() - to write or update test information to your report.
        extent.flush();
        //Call close() at the very end of your session to clear all resources.
        //If any of your test ended abruptly causing any side-affects (not all logs sent to ExtentReports, information missing), this method will ensure that the test is still appended to the report with a warning message.
        //You should call close() only once, at the very end (in @AfterSuite for example) as it closes the underlying stream.
        //Once this method is called, calling any Extent method will throw an error.
       //close() - To close all the operation
        extent.close();
    }
/*
   public static void switchContext(String context) {
        driver.getContext();
        Set<String> con = driver.getContextHandles();
        for (String c : con) {
            if (c.contains(context)) {
                driver.context(c);
                break;
            }
        }


    }

    
    @AfterMethod
	public void screenshotAndDeleteCookies(ITestResult testResult) throws IOException {
		//Taking screenshot in case of failure
		if(testResult.getStatus() == ITestResult.FAILURE){
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-" 
					+ Arrays.toString(testResult.getParameters()) +  ".jpg"));	
			}
		
		//Deleting cookies
		driver.manage().deleteAllCookies();
	}
 

    @AfterSuite
    public void suiteTearDown() {
    	driver.quit();
    }
    */
}
