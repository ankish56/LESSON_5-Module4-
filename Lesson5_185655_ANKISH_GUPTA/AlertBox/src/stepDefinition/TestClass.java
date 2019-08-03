package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {
	@Given("^Browser will open with the show alert box$")
	public void browser_will_open_with_the_show_alert_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Browser show alert box button");
	}

	@When("^User will click on show alert box$")
	public void user_will_click_on_show_alert_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("User will click on alert button");
	}

	@Then("^User should see a predefined alert box$")
	public void user_should_see_a_predefined_alert_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Alert message pop-ups on the screen");
	}


}
