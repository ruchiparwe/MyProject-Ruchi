package testLayer;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.PomLogin;
import pompackage.PomYourAddress;
import pompackage.PomYourorders;

public class YourAddress extends BaseAmazonClass{
	PomYourAddress YA;
	PomLogin Log;
	PomYourorders YO;
	//JavascriptExecutor js;

	@BeforeTest
	public void initsetup() 
	{ 
	 initiate();
	YA = new PomYourAddress(); 
	Log = new PomLogin();
	YO = new PomYourorders();
	
	}
	
	@BeforeClass
	public void signup() {
		Log.Signin(); 
		  Log.typeemail(prop.getProperty("email")); 
		  Log.ClickContinue();
		  Log.typepassword(prop.getProperty("password"));
		  Log.ClickSign();
	}
	@BeforeMethod 
	public void hellouse()
	{
		YO.clickHellouser();
		YA.GotoAddress();
	}
	
	//YourAddress_TC23_Valid "Your Address" Module
//The Address will be added to Your Addressess Window
	@Test 
	public void AddAddresses() {
		String actual  = YA.verifyCountry(); 
		Assert.assertEquals(actual, "Canada");
		YA.setFullname("ruchi");
		YA.setPhone("226-753-199");
		YA.setaddressline1("80 Esther Lorrie Drive");
		//YA.setaddressline2(null);
		YA.setCity("Toronto");
		YA.setprovince(9);
		YA.setpostalcode("M9W 0C6");
		YA.clickAddaddress();
		YA.saveaddressbutton();
	}
	
	//Checking the functionality of "Full name" field
	@Test
	public void invalidname() {
		YA.setFullname("");
		YA.setPhone("226-753-199");
		YA.setaddressline1("Esther Lorrie Drive");
		//YA.setaddressline2(null);
		YA.setCity("Toronto");
		YA.setprovince(9);
		YA.setpostalcode("M9W 0C6");
		YA.clickAddaddress();
		Assert.assertEquals(YA.nullname(), true);
		}
	
	//Checking the functionality of "Phone number" field
	@Test
	public void invalidphone()
	{
		YA.setFullname("ruchi");
		YA.setPhone("");
		YA.setaddressline1("Esther Lorrie Drive");
		//YA.setaddressline2(null);
		YA.setCity("Toronto");
		YA.setprovince(9);
		YA.setpostalcode("M9W 0C6");
		YA.clickAddaddress();
		Assert.assertEquals(YA.nullphone(), true);
	}
	
	//Checking the functionality of "Address" field
	@Test
	public void invalidaddress()
	{
		YA.setFullname("Ruchi");
		YA.setPhone("226-753-199");
		YA.setaddressline1("");
		YA.setaddressline2("");
		YA.setCity("Toronto");
		YA.setprovince(9);
		YA.setpostalcode("M9W 0C6");
		YA.clickAddaddress();
		Assert.assertEquals(YA.nulladdress(), true);
	}

//Checking the functionality of "City" field
	@Test
	public void invalidcity()
	{
		YA.setFullname("Ruchi");
		YA.setPhone("226-753-199");
		YA.setaddressline1("80Esther Lorrie ");
		YA.setaddressline2("");
		YA.setCity("Ahmedabad");
		YA.setprovince(9);
		YA.setpostalcode("M9W");
		YA.clickAddaddress();
		Assert.assertEquals(YA.invalidcity(), true);
	}
	
	//Checking the functionality of "City" field as NULL
	@Test
	public void nullcity()
	{
		YA.setFullname("Ruchi");
		YA.setPhone("226-753-199");
		YA.setaddressline1("80Esther Lorrie ");
		YA.setaddressline2("");
		YA.setCity("");
		YA.setprovince(9);
		YA.setpostalcode("M9W 0C6");
		YA.clickAddaddress();
		Assert.assertEquals(YA.invalidcity(), true);
	}
	@Test
	public void nullprovince()
	{
		YA.setFullname("Ruchi");
		YA.setPhone("226-753-199");
		YA.setaddressline1("80Esther Lorrie ");
		YA.setaddressline2("");
		YA.setCity("Toronto");
		//YA.setprovince(15);
		YA.setpostalcode("M9W");
		YA.clickAddaddress();
		Assert.assertEquals(YA.nullprovince(), true);
	}
	
	
	@Test
	public void missingpostalcode()
	{
		YA.setFullname("Ruchi");
		YA.setPhone("226-753-199");
		YA.setaddressline1("80Esther Lorrie ");
		YA.setaddressline2("");
		YA.setCity("Toronto");
		YA.setprovince(9);
		YA.setpostalcode("");
		YA.clickAddaddress();
		Assert.assertEquals(YA.nullpostalcode(), true);
	}
	
	@Test
	public void partialpostalcode()
	{
		YA.setFullname("Ruchi");
		YA.setPhone("226-753-199");
		YA.setaddressline1("80Esther Lorrie ");
		YA.setaddressline2("");
		YA.setCity("Toronto");
		YA.setprovince(9);
		YA.setpostalcode("M9W");
		YA.clickAddaddress();
		Assert.assertEquals(YA.partialpostalcodeerror(), true);
	}
	
	@Test
	public void defaultaddrestick()
	{
		YA.setFullname("Ruchi");
		YA.setPhone("226-753-199");
		YA.setaddressline1("1203 - 80Esther Lorrie Drive ");
		YA.setaddressline2("");
		YA.setCity("Toronto");
		YA.setprovince(9);
		YA.setpostalcode("M9W 0C6");
		YA.clickdefault();
		YA.clickAddaddress();
		//YA.saveaddressbutton();
		//Assert.assertEquals(YA.clickdefault(), true);
	}
	
	@Test
	public void clickdeliveryinstructions() throws InterruptedException
	{
		YA.setFullname("Ruchi");
		YA.setPhone("226-753-199");
		YA.setaddressline1("1203 - 80Esther Lorrie Drive ");
		YA.setaddressline2("");
		YA.setCity("Toronto");
		YA.setprovince(9);
		YA.setpostalcode("M9W 0C6");
		YA.clickinstructions();
		YA.selectApartment();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
	Thread.sleep(2000);
		YA.entercode("123");
	
	}

	
	@Test
	public void weekenddelivery() throws InterruptedException
	{
		YA.setFullname("Ruchi");
		YA.setPhone("226-753-199");
		YA.setaddressline1("80Esther Lorrie Drive ");
		YA.setaddressline2("");
		YA.setCity("Toronto");
		YA.setprovince(9);
		YA.setpostalcode("M9W 0C6");
		YA.clickinstructions();
		YA.selectApartment();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)","");
		Thread.sleep(2000);
		YA.entercode("123");
		YA.weekenddelivery();
		boolean	actual = 	YA.Saturdayoption();
		Assert.assertEquals(actual, true);
	}
		
	
	//YourAddress_TC35_" suggestion for right address"
	@Test
	public void suggestion() throws InterruptedException
	{
		YA.setFullname("Ruchi");
		YA.setPhone("226-753-199");
		YA.setaddressline1("80Esther Lorrie Drive ");
		YA.setaddressline2("");
		YA.setCity("Toronto");
		YA.setprovince(9);
		YA.setpostalcode("M9W 0C6");
		YA.clickinstructions();
		YA.selectApartment();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(1000);
		YA.entercode("123");
		YA.clickAddaddress();
		boolean actual = YA.suggestionadd();
		Assert.assertEquals(actual, true);
	}
	
		/*
		 * @AfterMethod public void close() { driver.close(); }
		 */
	
}
