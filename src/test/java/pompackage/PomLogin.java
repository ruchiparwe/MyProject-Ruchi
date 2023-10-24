package pompackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonClass;

public class PomLogin extends BaseAmazonClass{

	
	@FindBy(id = "ap_email") WebElement emailaddress;
	@FindBy(id = "continue")WebElement Continuebtn;
	@FindBy(id = "ap_password")WebElement Password;
	@FindBy(id = "signInSubmit")WebElement signinbtn;
	@FindBy(css= "#nav-link-accountList-nav-line-1")WebElement hellouser;
	@FindBy(css = "#nav-signin-tooltip > a:nth-child(1) > span:nth-child(1)")WebElement signin;
	@FindBy(id = "auth-email-missing-alert") WebElement emailerror;
	@FindBy(id = "auth-error-message-box") WebElement partialemail;
	@FindBy(id = "auth-error-message-box")WebElement passworderror;
	@FindBy(css = ".a-label") WebElement keepsigninbtn;
	
	//initiate page elements through create constructor
	Actions action;
	
	public PomLogin()
	{
		PageFactory.initElements(driver,this);
	} 
	public void Signin()
	{
	action	= new Actions(driver);	
	action.moveToElement(signin).click().perform();
	//signin.click();
	}
	
	public void typeemail(String email)
	{
		emailaddress.sendKeys(email);
	}
	public void ClickContinue()
	{
		Continuebtn.click();
	}
	public void typepassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void ClickSign()
	{
		signinbtn.click();
	}
	public String verify()
	{
		return driver.getTitle();
	}
	public boolean user()
	{
	return hellouser.isDisplayed();
	}
	public boolean emailerrordisplay()
	{
	  return emailerror.isDisplayed();
	}
	public boolean partialemailerror()
	{
		return partialemail.isDisplayed();
	}
	public boolean invalidpassword()
	{
	return passworderror.isDisplayed();
	}
	public void keepsignin()
	{
		keepsigninbtn.isSelected();
	}
}
