package com.spicejet.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.spicejet.qa.util.Util;

public class PageBase {

	public static WebDriver driver;
	public static Properties prop;
	public Util util;

	public PageBase() throws IOException {

		prop = new Properties();
		FileInputStream fi = new FileInputStream(

				".//src//main//java//com//spicejet//qa//config//configuration.properties");

		prop.load(fi);
	}

	public void initialization(String browserName, String url) throws InterruptedException {

		if (browserName.equals("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "D:\\Batch25\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		} else if (browserName.equals("EDGE")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("sorry as of now we do not support this browser");
		}
		util = new Util(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		util.navigateToURL(url);
		Thread.sleep(3000);
	}

	public void tearDown() {
		driver.quit();
	}

}
