package com.spicejet.qa.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.qa.base.PageBase;

public class LoginPage extends PageBase{

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[text()='Login']")
	WebElement loginIntialBtn;
	
	@FindBy(xpath = "//input[@data-testid='user-mobileno-input-box']")
	WebElement useridFld;
	
	@FindBy(xpath = "//input[@data-testid='password-input-box-cta']")
	WebElement passwordFild;
	
	@FindBy(xpath = "//div[@data-testid='login-cta']")
	WebElement loginBtn;
	
	public void login(String userid,String pwd) {
		loginIntialBtn.click();
		useridFld.sendKeys(userid);
		passwordFild.sendKeys(pwd);
		loginBtn.click();
				
	}

}
