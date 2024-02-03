package com.spicejet.qa.page;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.spicejet.qa.base.PageBase;

public class HomePage extends PageBase{

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	public String vaidateHomePageTitle() {
		return driver.getTitle();
	}

}
