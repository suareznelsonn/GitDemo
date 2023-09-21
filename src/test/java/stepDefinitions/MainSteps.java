package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("Setup the entries in database")
	public void setup_the_entries_in_database() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("*****************************");
		System.out.println("Setup the entries in database");
	}
	
	@When("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("launch the browser from config variables");
	}
	
	@When("hit the home page url of banking site")
	public void hit_the_home_page_url_of_banking_site() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hit the home page url of banking site");
	}
	
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on NetBanking landing page");
	}
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Practice landing page");
		Assert.assertTrue(false);
	}
	
//	@When("User login into application with {string} and {string}")
//	public void user_login_into_application_with_and(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println(username+" and the password is "+password);
//	}
	
	@When("^User login into application with (.+) and (.+)$")
	public void user_login_into_application_with_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(username+" and the password is "+password);
	}
	
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
	    System.out.println(data.get(0));   
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	}	
	
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Home Page is displayed");
	}
	
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Cards are displayed");
	}

}
