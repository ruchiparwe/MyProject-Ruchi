package amazon;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnew {

	//Step 1 System.setProperty(location of the driver)
	//step 2 Get Url 
	//step 3 Perform action on particular element
	// Step 4 Close browsers
	
	//STLC Test cases/Execute/Defect logging
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method");
	}
	
	@Test (priority=1)
	public void Writetestcases()
	{
		System.out.println("First write test cases");
	}
	
	@Test (priority=2)
	public void Executetestcases()
	{
		System.out.println("Then excute test cases");
	}
	@Test (priority=3)
	public void Defect()
	{
		System.out.println("Log defect");
	}
}
