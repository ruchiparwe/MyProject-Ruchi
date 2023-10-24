package pompackage;

import java.util.List;

import org.openqa.selenium.WebElement ;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseAmazonClass;

public class PomYourAddress extends BaseAmazonClass{

	@FindBy(css = "div.ya-card-row:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1)") WebElement YourAddress;
	@FindBy(id = "ya-myab-plus-address-icon") WebElement AddAddress;
	@FindBy(css = "#address-ui-widgets-countryCode > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)") WebElement CountryRegion;
	@FindBy(id = "address-ui-widgets-enterAddressFullName") WebElement Fullname;
	@FindBy(id = "address-ui-widgets-enterAddressPhoneNumber") WebElement Phonenumber;
	@FindBy(id = "address-ui-widgets-enterAddressLine1")WebElement Addressline1;
	@FindBy(id = "address-ui-widgets-enterAddressLine2")WebElement Addressline2;
	@FindBy(id = "address-ui-widgets-enterAddressCity") WebElement City;
	@FindBy(css = "#address-ui-widgets-enterAddressStateOrRegion > span:nth-child(1) > span:nth-child(1)") WebElement Province;
	@FindBy(id = "address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8") WebElement Ontario;
	@FindBy(id = "address-ui-widgets-enterAddressPostalCode") WebElement Postalcode;
	@FindBy(css = ".a-button-input") WebElement AddAddressbtn;
	@FindBy(css = "#a-autoid-2 > span:nth-child(1) > input:nth-child(1)") WebElement Saveaddressbtn;
	@FindBy(css = "#address-ui-widgets-enterAddressFullName-full-validation-alerts > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)") WebElement nameerror;
	@FindBy(id = "address-ui-widgets-enterAddressPhoneNumber-full-validation-alerts")WebElement Phonenumbererror;
	@FindBy(id = "address-ui-widgets-enterAddressLine2-full-validation-alerts")WebElement Addresserror;
	@FindBy(id = "address-ui-widgets-enterAddressCity-full-validation-alerts")WebElement Cityerror;
	@FindBy(id = "address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId-full-validation-alerts") WebElement Provinceerror;
	@FindBy(id = "address-ui-widgets-enterAddressPostalCode-full-validation-alerts") WebElement postalcodeerror;
	@FindBy(css = ".a-checkbox") WebElement defaultaddress;
	@FindBy(css = "div.a-expander-container:nth-child(5) > a:nth-child(1)")WebElement Deliverinstructions;
	@FindBy(css = "div.a-section:nth-child(19) > div:nth-child(3) > a:nth-child(1) > span:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)") WebElement deliverydrop;
	@FindBy(css = "span.a-button-normal:nth-child(1) > span:nth-child(1) > button:nth-child(1)") WebElement house;
	@FindBy(css  = "span.a-button-normal:nth-child(2) > span:nth-child(1) > button:nth-child(1)") WebElement Apartment;
	@FindBy(css = "div.a-section:nth-child(21) > div:nth-child(3) > a:nth-child(1)") WebElement enterdeliverttextbox;
	@FindBy(xpath = "//*[@id=\"address-ui-widgets-delivery-instructions-desktop-widget-html-container\"]/div/div/div[1]/div[3]/div[2]/div/div[2]/span/input") WebElement Securitycode;
	@FindBy(css = "div.a-section:nth-child(19) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1) > button:nth-child(1)") WebElement Saturdayyes;
	@FindBy (css = "div.a-section:nth-child(19) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1) > button:nth-child(1)") WebElement Sundayno;
	@FindBy (css = "div.a-section:nth-child(19) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1) > button:nth-child(1)")WebElement Sundayyes;
	@FindBy (xpath = "//input[@name=\"securityCode\"]") List<WebElement> securitycodelist;
	@FindBy (css = 	"div.a-section:nth-child(19) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1) > button:nth-child(1)") WebElement Saturdayno;
		//div.a-section:nth-child(19) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1) > button:nth-child(1)
	@FindBy (css = "#address-ui-widgets-suggested-address-block_id-outer > label:nth-child(1) > span:nth-child(3) > div:nth-child(1) > span:nth-child(1)") WebElement SuggestAddress;
	
	public PomYourAddress()
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void GotoAddress()
	{
		YourAddress.click();
		AddAddress.click();
	}
	public String verifyCountry()
	{
		return CountryRegion.getText();
	}
	public void setFullname(String FN)
	{
	Fullname.sendKeys(FN);	
	}
	public void setPhone(String phone)
	{
	Phonenumber.sendKeys(phone);	
	}
	public void setaddressline1(String line1)
	{
	Addressline1.sendKeys(line1);	
	}
	public void setaddressline2(String line2)
	{
	Addressline2.sendKeys(line2);	
	}
	public void setCity(String cty)
	{
	City.sendKeys(cty);	
	}
	public void setprovince(int prv)
	{
	//obj.selectByIndex(prv);
	Actions action = new Actions(driver);
	action.moveToElement(Province).click().build().perform();
	Ontario.click();
	}
	public void setpostalcode(String postal)
	{
	Postalcode.sendKeys(postal);
	}
	public void clickAddaddress()
	{
	AddAddressbtn.click();
	}
	public void saveaddressbutton()
	{
		Saveaddressbtn.click();
	}
	public boolean nullname()
	{
	return nameerror.isDisplayed();
	}
	public boolean nullphone()
	{
		return Phonenumbererror.isDisplayed();
	}
	public boolean nulladdress()
	{
		return Addressline1.isDisplayed();
	}
	public boolean invalidcity()
	{
		return Cityerror.isDisplayed();
	}
	public boolean nullcity()
	{
		return Cityerror.isDisplayed();
	}
	public boolean nullprovince()
	{
		return Provinceerror.isDisplayed();
	}
	public boolean nullpostalcode()
	{
		return postalcodeerror.isDisplayed();
	}
	public boolean partialpostalcodeerror()
	{
		return postalcodeerror.isDisplayed();
	}
	public void  clickdefault()
	{
		defaultaddress.click();
	}
	public void clickinstructions()
	{
		Deliverinstructions.click();
	}
	public void selectApartment()
	{
		Apartment.click();
	}
	public void weekenddelivery()
	{ 
		deliverydrop.click();
//	return Saturdayno.isDisplayed();
	}
	public boolean Saturdayoption()
	{
		return Saturdayno.isDisplayed();
	}
	
	public void entercode(String i)
	{
		securitycodelist.get(1).sendKeys(i);
	}
	public boolean suggestionadd()
	{
	return	SuggestAddress.isDisplayed();
	}
}

