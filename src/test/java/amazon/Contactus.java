package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Contactus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1 open the browser
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		
	//2 to type url
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/ap/register?showRememberMe=true&openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&prevRID=8493ZM1Q3N9CGWCWV94P&openid.assoc_handle=caflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&pageId=caflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&mobileBrowserWeblabTreatment=C");
		
		//Sept 3 type Full Name
		
	NewAddressPOM pom = new NewAddressPOM(driver);
	
	// driver.findElement(By.id("createAccountSubmit")).click();
		pom.typeFName("Ruchi Parwe");
	//	pom.typeFullName
	}

}











