package com.spiceject.qa.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.qa.base.PageBase;

public class TakeScreenshotUtil extends PageBase{
	public TakeScreenshotUtil() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	 
	 public void screenshotOnFailere(String methName) {
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			 
			File source=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(source, new File("./screenshots/"+"failure_"+methName+""+".png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	 }
	
	

}
