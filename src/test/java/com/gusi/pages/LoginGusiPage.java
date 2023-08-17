package com.gusi.pages;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginGusiPage {

	protected AppiumDriver driver;
	public WebDriverWait wait;

	public LoginGusiPage(AppiumDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
	AndroidElement username;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")
	AndroidElement password;

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"ENTER\"]")
	AndroidElement loginButton;

	public void typeName(String name) {
		username.sendKeys(name);
	}
	public void typePassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickLogin() {
		loginButton.click();
	}

}
