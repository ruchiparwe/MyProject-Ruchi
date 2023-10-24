package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseAmazonClass;

public class PomYourorders extends BaseAmazonClass{
	Actions action;
	
	@FindBy(id = "nav-link-accountList-nav-line-1") WebElement Hellouser;
	@FindBy(css = "div.ya-card-row:nth-child(2) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > span:nth-child(1)") WebElement Yourorders;
	@FindBy(css = "#orderTypeMenuContainer > ul > li.selected > span > span") WebElement orders;
	@FindBy(id = "time-filter_0") WebElement past30days;
	@FindBy(id = "a-autoid-1-announce") WebElement dropdown;
	@FindBy(id = "time-filter_1")WebElement past3months;
	@FindBy(id= "time-filter_2")WebElement y2023;
	@FindBy(css = "li.page-tabs__tab:nth-child(2) > a:nth-child(1)")WebElement BuyAgain;
	@FindBy(css = "li.page-tabs__tab:nth-child(4) > a:nth-child(1)")WebElement Cancelledorders;
	@FindBy(css = "li.page-tabs__tab:nth-child(3) > a:nth-child(1)") WebElement Notyetshipped;
	

	Select obj;
	Actions Action;
	
	public PomYourorders()
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void clickHellouser()
	{
		Hellouser.click();
	}
	
	public void Gotoorders()
	{
		Yourorders.click();
	}
	public void past30day()
	{
	
		Action = new Actions(driver);
		Action.moveToElement(dropdown).click().build().perform();
		y2023.click();
	
	}
	
	public void GotoBuyAgain()
	{
		BuyAgain.click();
	}
	public void GotoCancelledorders()
	{
		Cancelledorders.click();
	}
	public void GotoNotyetshipped()
	{
		Notyetshipped.click();
	}
		
	}


