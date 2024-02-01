package PageObjects;

import org.openqa.selenium.WebDriver;

import utils.TestBase;

public class pageobjectManager {
	
	public landingPage landingpage;
	public WebDriver driver;
	public offersPage offerspage;
	public checkoutPage checkoutpage;
	
	public pageobjectManager(WebDriver driver)
	{
		
		this.driver=driver;
	}
	public landingPage getLandingPage()
	{
		landingpage= new landingPage(driver);
		return landingpage;
	}
	public offersPage getOffersPage()
	{
		offerspage= new offersPage(driver);
		return offerspage;
	}
	public checkoutPage getcheckoutPage()
	{
		checkoutpage= new checkoutPage(driver);
		return checkoutpage;
	}
	
}
