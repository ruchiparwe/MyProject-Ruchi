package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseAmazonClass;

public class PomShoppingcart extends BaseAmazonClass{

	
	@FindBy (id = "add-to-cart-button")WebElement Addtocart;
	@FindBy (xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]") WebElement Productlist;
	@FindBy (css = "#sw-gtc > span:nth-child(1) > a:nth-child(1)") WebElement Gotocart;
	@FindBy (id = "a-autoid-1-announce") WebElement Qtybtn;
	@FindBy (css = ".a-dropdown-label") WebElement Qtndropdown;
	@FindBy (id = "twotabsearchtextbox") WebElement searchbox;
	@FindBy (id = "quantity_2") WebElement two;
	@FindBy (css = ".sc-product-image") WebElement productinformation;
	@FindBy (css = "span.a-size-small:nth-child(3) > span:nth-child(1)") WebElement delete;
	@FindBy(css= ".sc-product-image") WebElement product; 
	@FindBy (css = "#p_72\\/11192170011 > span:nth-child(1) > a:nth-child(1)") WebElement ratings;
	@FindBy (id = "s-result-sort-select_1")WebElement lowtohigh;
	@FindBy (id = "s-result-sort-select_2") WebElement highttolow;
	
	public PomShoppingcart()
	{
		PageFactory.initElements(driver, this);
	}
	public void productsearch()
	{
		Productlist.click();
	}
	
	public void Addsigletocart()
	{
		Addtocart.click();
	}
	public void Checkgotocart()
	{
		Gotocart.click();
	}
	public void checkQty()// checkagain
	{
		Actions action = new Actions(driver);
		action.moveToElement(Qtndropdown).click().build().perform();
		action.moveToElement(two).click().build().perform();
	}
	public void product1()
	{
		product.click();
	}
	public void productinfo()
	{
		productinformation.click();
	}
	public void removeproduct()
	{
		delete.click();
	}
	public void customerrating()
	{
		ratings.click();
	}
	public void fitlerprice()
	{
		Actions action = new Actions(driver);
		action.moveToElement(lowtohigh).click().build().perform();
		
	}

}
