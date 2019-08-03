package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {
	@Given("^User has the HTML page$")
	public void user_has_the_HTML_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("HTML page is provided");
	}

	@When("^User provides the path$")
	public void user_provides_the_path() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Path for the HTML page is given");
	}

	@Then("^Message hello is displayed when browser is opened$")
	public void message_hello_is_displayed_when_browser_is_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Message Hello is displayed");
	}
}
