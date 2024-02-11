package com.spicejet.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.spicejet.qa.base.PageBase;
import com.spicejet.qa.page.LoginLogout;

public class TestBase extends PageBase {
	public TestBase() throws IOException {
		super();
	}

	@BeforeSuite
	public void setUp() throws InterruptedException {
		
	String browser=	prop.getProperty("browsername");
	String url=	prop.getProperty("url");	
		initialization(browser,url);

	}
	@BeforeMethod
	public void loginTest() throws IOException {
		LoginLogout lgnpage=new LoginLogout();
		String userid=	prop.getProperty("userid");
		String pwd=	prop.getProperty("password");
		boolean loginFlag=lgnpage.login(userid, pwd);
		Assert.assertEquals(loginFlag, true);
		
	
	}
	@AfterMethod
	public void logOut() {
		
	}

	

	@AfterSuite
	public void BreakDown() {
		tearDown();
	}
}
