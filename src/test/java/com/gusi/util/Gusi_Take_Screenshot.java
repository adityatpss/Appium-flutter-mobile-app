package com.gusi.util;

import java.io.File;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

import com.gusi.base.TestBase;

public class Gusi_Take_Screenshot extends TestBase {

	@Test

	public void take_Screenshot() {
		// Take the screenshot
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


	}
}