package gusi_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyExam extends com.gusi.base.TestBase {

	@Test
	public void my_exam() throws Exception{ 

		//testcase id 1 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user clicks on My Exam the side menu should be redirected to the My exam page .");
		Assert.assertEquals("Actual", "expected");

		Thread.sleep(3000);

		//testcase id 2 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when clicks on the Notification button the user should be redirected to the notification page.");
		Assert.assertEquals("Actual", "expected");
		driver.navigate().back();
		Thread.sleep(3000);

		//testcase id 3 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when clicking on the Account icon the user should be redirected to the my profile page.");
		Assert.assertEquals("Actual", "expected");
		driver.navigate().back();
		Thread.sleep(3000);

		//testcase id 4  

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that the user can select the scans category to sort the exam list.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 5  

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that the exam list should be shown if the exam is already created by the users.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 6 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if the new user goes to my exam and there is no exam created then a message will be shown to the user.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 7

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when clicking on the Create New button the user should be redirected to the Upload / Create Exam page.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 8

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when clicking on the Back button the user should be redirected to the my exam page.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 9

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user goes to the create exam page the progress bar ( 1/ 3 ) should be displayed .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 10

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user clicks on the Continue button and there is no image selected.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 11 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user clicks on the camera icon to take a picture from mobile to upload scans.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 12

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user clicks on the image icon the user should select the image/video from the browser.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 13 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that the user is able to upload the selected image/video when clicking on the continue button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		
		//testcase id 14 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify by clicking on the Cross button uploaded image should be deleted.");
		Assert.assertEquals("Actual", "expected");
		driver.navigate().back();
		Thread.sleep(3000);

		//testcase id 15 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify if a user uploads the files above the size limit.");
		Assert.assertEquals("Actual", "expected");
		driver.navigate().back();
		Thread.sleep(3000);

		//testcase id 16 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user uploads the image with extension includes (jpeg, jpg, png, gif) otherwise shows a validation message.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		
		// NEED TO CHANGE
		
		
		//testcase id 17  

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if a user uploads the image but is doesn't support that image then should be displayed a validation message.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 18 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user uploads the video with extension includes (mp4, webm, flv, webm, ogg, wmv, mov, bmp).");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 19

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if a user uploads the video but is doesn't support that video then should be displayed a validation message.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 20

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if a user uploads more files above the limit the validation message should be displayed.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 21

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when clicking on the continue button the user should be redirected to the Step 2 of Create new exam ");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 22

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user clicks on the back button the user should be redirected to upload/ Create Exam page .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 23 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that the count process bar is working fine after uploading the file successfully.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 24

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that the user is able to redirected to the Step 2 of Create new exam  after uploading the scans when clicking on the next button .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 25 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that the user is able to see the progress bar when completing the first step and moving to the next step.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 26 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if some scans are left on the upload scan page the user is able to redirect to the Upload / Create Exam page when clicking on the Back button.");
		Assert.assertEquals("Actual", "expected");
		driver.navigate().back();
		Thread.sleep(3000);

		//testcase id 27 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that the user is able to select all the uploaded created exams when clicking on the Select All button.");
		Assert.assertEquals("Actual", "expected");
		driver.navigate().back();
		Thread.sleep(3000);

		//testcase id 28  

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that the user is able to deselect all the uploaded created exams when clicking on the Deselect All button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 29  

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that the user can manually select scans by clicking on the checkbox without clicking the select all button .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 30 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when clicking on selected scans user is able to deselect the scans.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 31

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when click on the delete button the pop-up box should be displayed and ask for You won't be able to revert this!");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 32

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user select the multiple  scan the  Assign Exam Type .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 33

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user selects the single scan and assigns the exam type.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 34 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user selects the scan in bulk and assigns the exam type.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 35 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when clicking on continue button the user should be redirected");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 36 //query

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("MSK type");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 37 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user clicks on the back button the user should be redirected to the Step 2 of Create new exam  page.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 38 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that the user is able to see the updated progress bar when completing the first step and moves to the next step.");
		Assert.assertEquals("Actual", "expected");
		driver.navigate().back();
		Thread.sleep(3000);

		//testcase id 39 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that the user can update the interpretation list when clicking on the Select Present/ absent as per the medical condition");
		Assert.assertEquals("Actual", "expected");
		driver.navigate().back();
		Thread.sleep(3000);

		//testcase id 40  

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user clicks on the Save Exam as Draft button the exam should be saved as a draft in My Exam.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 41  

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user clicks s on the Submit Exam button the exam should be submitted.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 42 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if an exam is reviewed then the status should be updated and marked with a tick.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 43

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify if an exam is submitted that should be highlighted in green color with a tick.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 44

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify if an exam is in draft that should be highlighted in red color.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 45

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user clicks on the exam to see the Exam detail.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 46

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user clicks on the back button the user should be redirected to my exam .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 47 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user clicks on the ellipsis ( Dots ) the pop-up will be shown with ( Edit , Download , Deleted )");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 48

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user clicks on the download button the exam should be downloaded.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 49 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when click on the delete button the pop-up box should be displayed and ask for You won't be able to revert this!");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 50 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user clicks on the edit button to edit the exam title.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 51

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when the user enters the name of the exam and clicks on the save changes button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 52 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user clifyhftuytiyicks on the share button the pop-up box should be shown.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 53

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user clicks on the shared button and leaves the fields blanks .");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 54

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user enters the email id to share the exam with users and clicks on the shared button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);


	}}
