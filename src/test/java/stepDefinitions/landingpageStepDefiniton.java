package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestBase;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.landingPage;
import PageObjects.offersPage;

public class landingpageStepDefiniton {
	public WebDriver driver;
	public String productname;
	public String prodname;
	public TestContextSetup testcontextsetup;
	public TestBase testbase;
	public landingPage landingpage;
	public landingpageStepDefiniton(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		landingpage=testcontextsetup.pageobjectmanager.getLandingPage();
	}
	@Given("Verify user is on greencart landing page")
	
	public void verify_user_is_on_greencart_landing_page() 
	{
		String pagetitle=landingpage.gettitleofpage();
		Assert.assertTrue(pagetitle.contains("GreenKart"));
	}
	@When("^User search with short name (.+) and extracted the actual name of product$")
	public void user_search_with_short_name_and_extracted_the_actual_name_of_product(String shortname) throws InterruptedException
	{
	  	landingpage.searchitem(shortname);
		Thread.sleep(5000);
		testcontextsetup.productname=landingpage.getproductname().split("-")[0].trim();
		Thread.sleep(3000);
		System.out.println("--Product Name extracted from landing page-- : "+testcontextsetup.productname);
		
	}
	@When("Add {string} items of the selected product to cart")
	public void Add_3_items_of_the_selected_product_to_cart(String quantity) throws InterruptedException
	{
		landingpage.incrementqty(Integer.parseInt(quantity));
		Thread.sleep(3000);
		landingpage.addtocart();
	}
	

}
