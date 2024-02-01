package stepDefinitions;

import io.cucumber.java.en.And;
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

import PageObjects.checkoutPage;
import PageObjects.landingPage;
import PageObjects.offersPage;

public class chechoutStepDefiniton {
	public WebDriver driver;
	public String productname;
	public String prodname;
	public TestContextSetup testcontextsetup;
	public TestBase testbase;
	public landingPage landingpage;
	public checkoutPage checkoutpage;
	public chechoutStepDefiniton(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		checkoutpage=testcontextsetup.pageobjectmanager.getcheckoutPage();
	}
	
	@Then("^User proceed to checkout and validate the (.+) items in checkout page$")
	public void User_proceed_to_checkout_and_validate_the_name_items_in_checkout_page(String name) throws InterruptedException
	{
		checkoutpage.checkoutitems();
		Thread.sleep(3000);
		String extractedname=checkoutpage.verifyitemname();
		Assert.assertEquals(testcontextsetup.productname, extractedname);
		
	}
	
	@Then("verify the user has ability to enter promo code and place the order")
	public void verify_the_user_has_ability_to_enter_promo_code_and_place_the_order()
	{
		Assert.assertTrue(checkoutpage.verifyPromoBtn());
		Assert.assertTrue(checkoutpage.verifyPlaceOrder());	
	}
	 
	
	    
	
	

}
