package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {
	@Given("^User is trying to open HtmlUnit Page$")
	public void user_is_trying_to_open_HtmlUnit_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("User open HTML page");
	}

	@When("^User opens HtmlUnit page$")
	public void user_opens_HtmlUnit_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("User opens HTML pages");
	}

	@Then("^open Awesome page and display various style and colors of text$")
	public void open_Awesome_page_and_display_various_style_and_colors_of_text() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Various Style and Colors is Displayed");
	}

}
