package pompackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonClass;

public class PomPayment extends BaseAmazonClass {

	@FindBy(xpath = "//*[@id=\"a-page\"]/div[1]/div/div[3]/div[2]/a/div/div/div/div[2]/div/span") WebElement YourPayemnts;
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div/div[2]/span/span/input") WebElement AddPaymentbtn;
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div/div[2]/span/span[1]/span/input") WebElement Addcard;
//	@FindBy(className = "a-input-text a-form-normal apx-add-credit-card-account-holder-name-input mcx-input-fields") WebElement name;
	@FindBy( xpath = "//*[@id=\"a-popover-header-1\"]") WebElement Adddebitpage;
	@FindBy (xpath = "//input[starts-with(@id,\"pp\")]")List <WebElement> carddetails;
	@FindBy (id = "pp-lrfd1G-26") WebElement cvv;
	@FindBy (css = "#pp-lrfd1G-23 > span:nth-child(1) > span:nth-child(1)") WebElement date;
	@FindBy (css = "#pp-lrfd1G-24 > span:nth-child(1) > span:nth-child(1)") WebElement year;
	@FindBy (css = ".a-button-input") WebElement Addyourcard;
	
	public PomPayment()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void paymentsmodule()
	{
		YourPayemnts.click();
	}
	public void AddPaybtn() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(AddPaymentbtn).click().build().perform();
	//	AddPaymentbtn.click();
		//AddPaymentbtn.click();
		Addcard.click();
	}

	/*
	 * public void cardpage() { Actions action = new Actions(driver);
	 * action.moveToElement(Adddebitpage).click().build().perform();
	 * 
	 * }
	 */
	public void cardnumber(String card, int i)
	{
		carddetails.get(i).sendKeys(card);
		
	}
	
}
