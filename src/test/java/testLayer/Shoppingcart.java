package testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import basepackage.BaseAmazonClass;
import pompackage.PomLogin;
import pompackage.PomShoppingcart;
import pompackage.Pomsearch;

public class Shoppingcart extends BaseAmazonClass{
	PomShoppingcart SC;
	Pomsearch Ps;
	Select qty;
	PomLogin Log;
	
	@BeforeTest
	public void initsetup() 
	{ 
	 initiate();
	  SC = new PomShoppingcart();
	  Ps = new Pomsearch();
	  Log = new PomLogin();
	}
	
	/**
	//Shoppingcart_TC59_"Add one item to the cart"
	   */
	@Test
	public void Addtocartcheck()
	{
		Ps.searchclick();
		Ps.partialtext("Nivea body Lotion");
		SC.Addsigletocart();
	}
	
	/**
     * Scenario 60: Increase the quantity of the item from the cart.
     */
	@Test
	public void IncreaseQuanity() throws InterruptedException 
	{
		Ps.searchclick();
		Ps.partialtext("Nivea body Lotion");
		SC.Addsigletocart();
		Thread.sleep(1000);
		SC.Checkgotocart();
		SC.checkQty();
	}
	
	//Shoppingcart_TC61_"Add the same items multiple items" - working on it 
	@Test
	public void Multipletry() throws InterruptedException
	{
		Ps.searchclick();
		Ps.partialtext("Nivea Nourishing Skin Firming Body Lotion, 16.9 Fluid Ounce ");
		SC.productsearch();//add in all
		SC.Addsigletocart();
		//Thread.sleep(100);
		SC.Checkgotocart();
	Thread.sleep(100);	
		SC.product1();
		Thread.sleep(1000);
		SC.Addsigletocart();
	}
		
	/**
     * Shoppingcart_TC63_Remove some items from the cart
   */
	@Test
	public void Removeitems () throws InterruptedException 
	{
		Ps.searchclick();
		Ps.partialtext("Olay Ultra Moisture Body Wash with Shea Butter, 2,184mL Total (Pack of 6)");
		SC.productsearch();
		SC.Addsigletocart();
		Thread.sleep(1000);
		SC.Checkgotocart();
		Thread.sleep(1000);
		SC.removeproduct();
	}
	
	/**
     * Shoppingcart_TC65_Click on an item in the cart the user should see more information about the product when click on an item in the cart.
   */
	@Test
	public void productinfo() throws InterruptedException 
	{
		Ps.searchclick();
		Ps.partialtext("Nivea body Lotion");
		SC.productsearch();
		SC.Addsigletocart();
		Thread.sleep(100);
		SC.Checkgotocart();
		SC.productinfo();
	}
	
	
	/**
     * Scenario 66: close the amazon browser and product should be there when reopened.
     */
	@Test
	public void productvisible() throws InterruptedException 
	{
		 Log.Signin();
		  Log.typeemail(prop.getProperty("email"));
		  Log.ClickContinue();
		  Log.typepassword(prop.getProperty("password"));
		  Log.keepsignin();
		  Log.ClickSign();
		  Ps.searchclick();
		Ps.partialtext("Nivea body Lotion");
		SC.Addsigletocart();
		SC.Checkgotocart();
		Thread.sleep(100);
	driver.close();
		initiate();
	}
	/*
    Filtration_TC51_"Customer Rating" //needhelp
     */
	@Test
	public void filterrating()
	{
		Ps.searchclick();
		Ps.partialtext("Nivea body Lotion");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(800,0)","");
		SC.customerrating();
	}
	//Filtration_TC55_"Price Availability "
	@Test
	public void Pricefilter()
	{
		Ps.searchclick();
		Ps.partialtext("Nivea body Lotion");
		SC.fitlerprice();
	}
}
