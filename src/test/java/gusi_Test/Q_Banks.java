package gusi_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Q_Banks extends com.gusi.base.TestBase {

	@Test
	public void q_banks() throws Exception{ 

		//testcase id 1 

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		System.out.println("Verify that when user clicks on My Profile the side menu should be redirected to the profile page without any error");
		Assert.assertEquals("Actual", "expected");
		Thread.sleep(3000);

}

}
