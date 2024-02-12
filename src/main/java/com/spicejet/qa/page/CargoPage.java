package com.spicejet.qa.page;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.qa.base.PageBase;

public class CargoPage extends PageBase {
	public CargoPage() throws IOException {
		// super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[text()='Cargo']")
	WebElement CargoBtn;

	@FindBy(xpath = "//a[@id='useful-tab']")
	WebElement Pincodeservice;

	@FindBy(xpath = "//input[@placeholder='Enter PIN code']")
	WebElement pincode;

	@FindBy(xpath = "//button[@id='_pincodeStatus']")
	WebElement pincodestatus;

	// @FindBy(xpath="//i[@class='fa fa-check-circle']")
	@FindBy(xpath = "//span[@class='alert-success alert pinCodeServicable']")
	WebElement pincoderesult;

	@FindBy(xpath = "//span[@class='alert-danger alert pinCodeNotExists']")
	WebElement pincodenotservicebale;

	// Flight tab related
	@FindBy(xpath = "//a[@id='flight-tab']")
	WebElement Flighttab;

	@FindBy(xpath = "//input[@id='tbCountries']")
	WebElement Origin;
	@FindBy(xpath = "//input[@id='hidOrigin']")
	WebElement orginslection;
	@FindBy(xpath = "//input[@id='tbCountriesDes']")
	WebElement Destination;
	@FindBy(xpath = "//input[@id='hidDesc']")
	WebElement destselection;

	@FindBy(xpath = "//input[@id='dateForFlight']")
	WebElement date;

	@FindBy(xpath = "//button[@id='_getA2aFlightList']")
	WebElement Searchflight;

	// Mouse over
	@FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
	WebElement Services;
	@FindBy(xpath = "(//div[@class='dropdown-menu'])[1]")
	WebElement Servicesdropdown;

	@FindBy(xpath = "(//a[@data-toggle='dropdown'])[2]")
	WebElement Industries;

	@FindBy(xpath = "(//div[@class='dropdown-menu'])[2]")
	WebElement Industriesdrop;

	@FindBy(xpath = "(//a[@data-toggle='dropdown'])[3]")
	WebElement support;
	@FindBy(xpath = "(//div[@class='dropdown-menu'])[3]")
	WebElement supportoption;

	public void options() {

	}

	public String cargopagedetails() throws InterruptedException {
		Thread.sleep(10000);
		CargoBtn.click();
		Thread.sleep(3000);
		Set<String> allhandles = driver.getWindowHandles();
		Iterator<String> it = allhandles.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		System.out.println("the child window :" + childwindow);
		driver.switchTo().window(childwindow);

		Thread.sleep(3000);
		Pincodeservice.click();
		Thread.sleep(3000);
		pincode.sendKeys("500084");
		Thread.sleep(3000);
		pincodestatus.click();
		Thread.sleep(3000);
		String status = pincoderesult.getText();
		System.out.println(status);
		Thread.sleep(3000);
		pincode.clear();
		Thread.sleep(3000);
		pincode.sendKeys("516434");
		Thread.sleep(3000);
		pincodestatus.click();
		Thread.sleep(3000);
		String statu = pincodenotservicebale.getText();
		Thread.sleep(3000);
		System.out.println(statu);
		return driver.getTitle();

	}

	public void flightdetais() throws InterruptedException {

//		Actions act = new Actions(driver);
//		act.moveToElement(Origin).build().perform();
//		Thread.sleep(3000);
		Flighttab.click();
		Thread.sleep(3000);
		Origin.sendKeys("HYDERABAD (HYD)");
		Thread.sleep(3000);
	//	act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// orginslection.click();
		Thread.sleep(3000);
//		Actions act1 = new Actions(driver);
//		act1.moveToElement(Destination).build().perform();
//		Thread.sleep(3000);
		Destination.sendKeys("DELHI (DEL)");
		Thread.sleep(3000);
	//	act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// destselection.click();
		Thread.sleep(3000);
		date.clear();
		Thread.sleep(3000);
		date.sendKeys("2024-02-09");
		Thread.sleep(3000);
		Searchflight.click();
		Thread.sleep(10000);
		System.out.println("Flight services");
		// return driver.getTitle();

	}

	public String mouseover() throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(Services).build().perform();
		Thread.sleep(3000);
		String servoptions = Servicesdropdown.getText();
		System.out.println("Services Dropdown options as below");
		Thread.sleep(3000);
		return servoptions;

	}

	public String indusop() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(Industries).build().perform();
		Thread.sleep(3000);
		String Indusoptions = Industriesdrop.getText();
		Thread.sleep(3000);
		System.out.println("Industries Dropdown options as below");
		return Indusoptions;
	}

	public String supportops() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(support).build().perform();
		Thread.sleep(3000);
		String Servoptions = supportoption.getText();
		Thread.sleep(3000);
		System.out.println("Support Dropdown options as below");
		
		return Servoptions;

	}
}
