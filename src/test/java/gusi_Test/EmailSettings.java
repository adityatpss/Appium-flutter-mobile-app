package gusi_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailSettings extends com.gusi.base.TestBase {

	@Test
	public void email_settings() throws Exception{ 

		//testcase id 1 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that there are no Checkboxes selected and click on the Save Button");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 2 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if the user selects the checkbox immediately and clicks on the save button the notification should be received immediately.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 3 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if the user selects the checkbox Daily and clicks on the save button the notification should be received on a daily basis.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 4 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if the user selects the checkbox Weekly and clicks on the save button the notification should be received on a weekly basis.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 5 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if the user selects the Chcekbox Immediately / Daily and clicks on the save button the notification should be received accordingly.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 6 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if the user selects the Chcekbox Immediately / Weekly and clicks on the save button the notification should be received accordingly.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 7 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if the user selects the Chcekbox Daily / Immediately and clicks on the save button the notification should be received accordingly.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 8 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that if the user selects the Chcekbox Daily / Weekly and clicks on the save button the notification should be received accordingly.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

		//testcase id 9 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that all three checkboxes are selected and click on the save button.");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);



	}

}
