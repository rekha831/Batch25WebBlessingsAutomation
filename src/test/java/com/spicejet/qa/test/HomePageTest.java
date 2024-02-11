package com.spicejet.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicejet.qa.page.HomePage;
import com.spicejet.qa.page.LoginLogout;

public class HomePageTest extends TestBase{

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void vaidateHomePageTitle() throws IOException {
		HomePage homepage=new HomePage();
	String actualTitle=	homepage.vaidateHomePageTitle();
	String expectedTitle=	prop.getProperty("expectedTitle");
	Assert.assertEquals(actualTitle, expectedTitle);
	}

}
