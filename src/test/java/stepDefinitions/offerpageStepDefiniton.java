package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.landingPage;
import PageObjects.offersPage;
import PageObjects.pageobjectManager;

public class offerpageStepDefiniton {
	public String offerprodname;
	public TestContextSetup testcontextsetup;
	public pageobjectManager pageobjectmanager;
	public offerpageStepDefiniton(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
	
	@Then("^User searched for (.+) short name in offer page$")
	public void user_searched_for_same_short_name_in_offer_page(String shortname) throws InterruptedException 
	{
		
		switchtoOfferPage();
		offersPage offerspage=testcontextsetup.pageobjectmanager.getOffersPage();
		offerspage.searchitem(shortname);
		Thread.sleep(3000);
		offerprodname =offerspage.getproductname();
		System.out.println("--Product Name extracted from offer page-- : "+offerprodname);
		
	}
	public void switchtoOfferPage() throws InterruptedException
	{
		landingPage landingpage=testcontextsetup.pageobjectmanager.getLandingPage();
		landingpage.selecttopdeals();
		Thread.sleep(3000);
		//testcontextsetup.driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		testcontextsetup.genericutils.switchWindowToChild();
		Thread.sleep(3000);
	}
	@Then("validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(testcontextsetup.productname, offerprodname, "Same");	
	}

}
