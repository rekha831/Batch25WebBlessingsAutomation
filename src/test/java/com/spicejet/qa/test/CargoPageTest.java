package com.spicejet.qa.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicejet.qa.page.CargoPage;

public class CargoPageTest extends TestBase{

	public CargoPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
   public void cargotest() throws IOException, InterruptedException {
	   CargoPage crgpag =new CargoPage();
	   String actualTitle=	crgpag.cargopagedetails();
	   System.out.println(actualTitle);
		String expectedTitle=	prop.getProperty("cargoexpectedTitle");
		Assert.assertEquals(actualTitle, expectedTitle);
		
	System.out.println("ActualTitle is same as Expected Title");
	
	CargoPage services= new CargoPage();
	String Servdropoptions= services.mouseover();
	System.out.println(Servdropoptions);
	CargoPage Indus= new CargoPage();
	String Indusdropoptions= Indus.indusop();
	System.out.println(Indusdropoptions);
	CargoPage Sup= new CargoPage();
	String Supportdropoptions= Sup.supportops();
	System.out.println(Supportdropoptions);
	
	CargoPage flights=new CargoPage();
	flights.flightdetais();
	
   }
	
}
