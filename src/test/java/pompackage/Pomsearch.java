package pompackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonClass;

public class Pomsearch extends BaseAmazonClass{

	Actions action;
	@FindBy(id = "twotabsearchtextbox")WebElement searchbox;
	@FindBy(id = "nav-search-submit-button")WebElement searchbutton;
	@FindBy(css = ".widgetId\\=search-results_1 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > img:nth-child(1)") WebElement product;
	@FindBy(id = "productTitle") WebElement productname;
	@FindBy (xpath = "//div[@data-asin and @data-component-type=\"s-search-result\"]") List<WebElement> productlist;
	@FindBy (id ="corePriceDisplay_desktop_feature_div") WebElement productprice;
	@FindBy (css = "#averageCustomerReviews > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)") WebElement productrating;
	@FindBy(id = "landingImage") WebElement productimage;
	@FindBy(css = "a.s-pagination-item:nth-child(8)") WebElement Nextbtn;
	@FindBy(css = "#nav-xshop > a:nth-child(5)") WebElement Newreleases;
	@FindBy(css = "span.s-pagination-item:nth-child(3)") WebElement pagination;
	
	public Pomsearch()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchclick()
	{
		Actions action = new Actions(driver);
		action.moveToElement(searchbox).click().build().perform();
	}
	
	public void partialtext(String st)
	{
		searchbox.sendKeys(st);
		searchbutton.click();
		//product.click();
	}
	
	public boolean verifyproductname()
	{
	return productname.isDisplayed();
	
	//return productprice.isDisplayed();
	//return productrating.isDisplayed();
//	return productimage.isDisplayed();
	}
	
	public int getnoofproducts()
	{
		return productlist.size();
	}
	
	public void verifynextpagebtn()
	{
		Nextbtn.click();
	}
	
	public void verifynewrelease()
	{
		Newreleases.click();
	}
	public void paginationcheck()
	{
		pagination.click();
	}
}