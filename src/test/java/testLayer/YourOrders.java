package testLayer;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.PomLogin;
import pompackage.PomYourorders;

public class YourOrders extends BaseAmazonClass{
	
	PomYourorders YO;
	PomLogin Log;
	
	@BeforeTest
	public void initsetup() 
	{ 
		initiate();
	YO = new PomYourorders(); 
	Log = new PomLogin();
	
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
	}
	
	 @Test 
	public void Buyagain() {
		YO.Gotoorders();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		YO.GotoBuyAgain();
	}
	 
	@Test
	public void Notyetship() {
		YO.Gotoorders();
		YO.GotoNotyetshipped();
	}
	@Test 
	public void cancelledorder() {
		YO.Gotoorders();
		YO.GotoCancelledorders();
	}
	
	 @Test
	public void droporders()
	{
		YO.Gotoorders();
		YO.past30day();
	} 
		
 //@AfterMethod public void close() { driver.close(); }
		 
}
