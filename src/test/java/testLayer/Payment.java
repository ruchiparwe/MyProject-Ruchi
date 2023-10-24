package testLayer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.PomLogin;
import pompackage.PomPayment;
import pompackage.PomYourAddress;
import pompackage.PomYourorders;

public class Payment extends BaseAmazonClass{

	PomYourAddress YA;
	PomLogin Log;
	PomYourorders YO;
	PomPayment Pay;
	
	@BeforeTest
	public void initsetup() 
	{ 
	 initiate();
	YA = new PomYourAddress(); 
	Log = new PomLogin();
	YO = new PomYourorders();
    Pay = new PomPayment();
	}
	
	@BeforeClass
	public void signup() {
		Log.Signin();
		  Log.typeemail(prop.getProperty("email")); 
		  Log.ClickContinue();
		  Log.typepassword(prop.getProperty("password"));
		  Log.ClickSign();
	}
	// Open the payment Module to add the debit/creditcard
	@Test //(groups = "groupA")
	public void verifyPaymentmodule() throws InterruptedException 
	{
		YO.clickHellouser();
		Pay.paymentsmodule();
		Pay.AddPaybtn();
		Thread.sleep(2000);
		Pay.cardnumber("5123456789012346", 0);
		Pay.cardnumber("Ruchi Parwe", 1);
		Pay.cardnumber("100", 2);
	}
	 	
	/*
	 * @Test (dependsOnMethods = {"verifyPaymentmodule"}) public void
	 * debitcreditpage() { //Pay.cardpage(); Pay.cardnumber("1245");
	 * //Pay.nameofcard("RuchiParwe"); }
	 */
	
}


