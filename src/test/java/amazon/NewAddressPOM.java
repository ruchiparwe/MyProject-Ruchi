package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddressPOM {

	//annotation
	WebDriver driver;
	//referencevaraible.findelements (By.
//	@FindBy(id="createAccountSubmit")WebElement FullName;
	@FindBy(id="ap_customer_name")WebElement FullName;
	
	public NewAddressPOM(WebDriver driver)
	{	
	PageFactory.initElements(driver,this);
	}
	
	public void typeFName(String Fullname)
	{
		FullName.sendKeys(Fullname);
	}
	
	/*
	 * public void typePhoneNum(String Phonenumber) {
	 * //driver.FindElement(By.ID("----").snekeys(PhoneNumber)
	 * PhoneNumber.sendKeys(Phonenumber); }
	 */

	
}













