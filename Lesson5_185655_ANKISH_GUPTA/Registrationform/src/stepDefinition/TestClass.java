package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {

	@Given("^User is on Email Registration Page$")
	public void user_is_on_Email_Registration_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on Email Registration Page");
	}

	@When("^User will forget to enter username$")
	public void user_will_forget_to_enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User will forget to enter username");
	}

	@Then("^Registration Form will not be Accepted\\.$")
	public void registration_Form_will_not_be_Accepted() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Registration Form will not be Accepted");	}

	@When("^Password and confirm Password are different\\.$")
	public void password_and_confirm_Password_are_different() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Password and confirm Password are different");
	}

	@Then("^Message will display Passwords donot match!$")
	public void message_will_display_Passwords_donot_match() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Message will display Passwords donot match!");
	}

	@When("^User will forget to enter FirstName and LastName$")
	public void user_will_forget_to_enter_FirstName_and_LastName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User will forget to enter FirstName and LastName");
	}

	@When("^User will forget to select Gender$")
	public void user_will_forget_to_select_Gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User will forget to select Gender");
	}

	@When("^User will forget to enter BirthDate, Email and Address$")
	public void user_will_forget_to_enter_BirthDate_Email_and_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User will forget to enter BirthDate, Email and Address");
	}

	@When("^User will forget to select city$")
	public void user_will_forget_to_select_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User will forget to select city");
	}

	@When("^User will forget to enter PhoneNumber$")
	public void user_will_forget_to_enter_PhoneNumber() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User will forget to enter PhoneNumber");
	}

	@When("^User will forget to select Hobbies$")
	public void user_will_forget_to_select_Hobbies() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User is on Email Registration Page");
	}



}