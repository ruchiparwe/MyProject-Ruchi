package testLayer;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import basepackage.BaseAmazonClass;
import pompackage.PomLogin;
import pompackage.PomYourAccount;
import pompackage.PomYourorders;

public class YourAccount extends BaseAmazonClass{
		PomYourAccount PYA;
		YourAccount YA;
		PomLogin Log;
		PomYourorders YO;
		Actions action;
	
		
		  @BeforeTest public void initsetup() 
		  { 
			  initiate();
		  PYA = new PomYourAccount();
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
		  
		  
		@Test
		public void verifyname1()
		{
			String actual = PYA.verifyname();
			System.out.println(actual);
			Assert.assertEquals("Hello, Ryuchi",actual);
		}
		
		@Test
		public void hellouse()
		{
			YO.clickHellouser();
		}
		
		@Test
		public void mousehoverhello()
		{
			PYA.checkingmousehover();
		}
}
