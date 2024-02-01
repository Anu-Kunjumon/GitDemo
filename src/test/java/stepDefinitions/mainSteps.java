package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("4User landed on netbanking landing page");
	    }
	//@When("User login to application with {string} and password {string}")
	//public void user_login_to_application(String username, String passwd) {
	    // Write code here that turns the phrase above into concrete actions
	//	System.out.println("2User log in with usernameeee: "+username+" password: "+passwd);
	//	}
	@Given("User is on practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("5User landed on practice landing page");
	    }
	@When("^User login to application with (.+) and password (.+)$")
	public void user_login_to_application(String username, String passwd) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("6User log in with usernameeee: "+username+" password: "+passwd);
	}
	
	@When("User signup int to application with")
	public void user_signup_in_to_application_with(List<String> data)
	{
		System.out.println("Data1 "+data.get(0));
		System.out.println("Data1 "+data.get(1));
		System.out.println("Data1 "+data.get(2));
		System.out.println("Data1 "+data.get(3));
		System.out.println("7User signup int to application");
		
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("8Home page is displayed");
	}
	@Then("Card details are displayed")
	public void card_details_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("9Card details are displayed");
	}
	
	
	
	@When("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("2launch the browser from config variables");
	}
	@Then("Hit the home page url")
	public void hit_the_home_page_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("3Hit the home page url");
	}
}

