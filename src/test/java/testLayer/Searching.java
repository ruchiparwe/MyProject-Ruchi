package testLayer;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.PomLogin;
import pompackage.PomYourAddress;
import pompackage.PomYourorders;
import pompackage.Pomsearch;

public class Searching extends BaseAmazonClass{

	Pomsearch Ps;
	PomLogin Log;
	PomYourorders YO;
	PomYourAddress YA;
	
	@BeforeTest
	public void initsetup() 
	{ 
	 initiate();
	YA = new PomYourAddress(); 
	Log = new PomLogin();
	YO = new PomYourorders();
	Ps = new Pomsearch();
	}
	
	@Test
	public void verifysearchbox()
	{
		Ps.searchclick();
	}
	
	@Test
	public void productsverification()
	{
		Ps.searchclick();
		Ps.partialtext("Nivea body Lotion");
		Assert.assertEquals(Ps.verifyproductname(), true);
		
	}
	@Test
	public void noofproductsperpage()
	{
		Ps.searchclick();
		Ps.partialtext("Nivea body Lotion");
		System.out.println(Ps.getnoofproducts());
	}
	
	@Test
	public void nextpage() throws InterruptedException
	{
	Ps.searchclick();
	Ps.partialtext("Nivea body Lotion");
	Thread.sleep(2000);
	Ps.verifynextpagebtn();
	}
	
	@Test
	public void newreleasebtn()
	{
		Ps.verifynewrelease();
	}
	
	
	
	
}
