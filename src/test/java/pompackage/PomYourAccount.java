package pompackage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonClass;
import dev.failsafe.internal.util.Assert;

public class PomYourAccount extends BaseAmazonClass{
	Actions action;
	@FindBy(id = "nav-link-accountList-nav-line-1") WebElement Yourname;
	@FindBy(id = "nav_prefetch_yourorders") WebElement Yourorders;
	@FindBy(id = "nav-link-accountList")WebElement dropdown;
	
	public PomYourAccount()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyname()
	{
		 return Yourname.getText();
	}
	
	public void checkingmousehover() 
	{
		action = new Actions(driver);
		action.moveToElement(dropdown).click().build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		Yourorders.click();
	}
}
