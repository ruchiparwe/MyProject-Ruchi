package testLayer;

import static org.testng.Assert.assertEquals;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import basepackage.BaseAmazonClass;
import pompackage.PomLogin;


public class SignupTest extends BaseAmazonClass{

	PomLogin Log;
	
	public SignupTest()
	{
		super();
	}
	
	
	  @BeforeMethod public void initsetup() 
	  { 
		  initiate();
	  Log = new PomLogin();
	  }
	 
	
	/*@Test (priority=1)
	public void Title() {
		String actual = Log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "Amazon.ca: Low Prices - Fast Shipping - Millions of Items");
						}*/
	
	  @Test 
	  public void signup() {
	  Log.Signin(); 
	  Log.typeemail(prop.getProperty("email")); 
	  Log.ClickContinue();
	  Log.typepassword(prop.getProperty("password"));
	  Log.ClickSign();
	  }
	  
	  @Test
	  public void nullemail()
	  {
		  Log.Signin();
		  Log.typeemail("");
		  Log.ClickContinue();
		  Assert.assertEquals(Log.emailerrordisplay(), true);
	  }
	  
	  @Test
	  public void invalidemail()
	  {
		  Log.Signin();
		  Log.typeemail("ruchi.parwe");
		  Log.ClickContinue();
		  Assert.assertEquals(Log.partialemailerror(), true);
	  }
	  
	  @Test
	  public void invalidpass()
	  {
		  Log.Signin();
		  Log.typeemail("ryuchipatel@gmail.com");
		  Log.ClickContinue();
		  Log.typepassword("abc");
		  Log.ClickSign();
		  Assert.assertEquals(Log.invalidpassword(), true);
	  }
	  
	  
	  /**
	     * Scenario 15: Login_TC15_"Keep me signed in"
	     */
		@Test
	  public void keepmesignin() 
	  {
	  Log.Signin();
	  Log.typeemail(prop.getProperty("email"));
	  Log.ClickContinue();
	  Log.typepassword(prop.getProperty("password"));
	  Log.keepsignin();
	  Log.ClickSign();
	  
	  }
	/* @AfterMethod 
	 public void close()
	 { 
		 driver.close();
	 }*/
		 
	  
		 
}