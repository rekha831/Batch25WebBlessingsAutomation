package com.spicejet.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicejet.qa.page.LoginPage;

public class LoginPageTest extends TestBase{
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void loginTest() throws IOException {
		LoginPage lgnpage=new LoginPage();
		String userid=	prop.getProperty("userid");
		String pwd=	prop.getProperty("password");
		lgnpage.login(userid, pwd);
		
	
	}

}
