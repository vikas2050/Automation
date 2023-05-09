package stepDefination;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.CreateAccount;

public class CreateAccountSteps extends Base {
	 CreateAccount c = new CreateAccount();

		


	@Given("user click on create an acccunt")
	public void user_click_on_create_an_acccunt() {
		c.user_click_on_create_an_acccunt();

	}

	@Given("user enter first name")
	public void user_enter_first_name() {
		c.user_enter_first_name();

	}

	@Given("user enter last name")
	public void user_enter_last_name() {
		c.user_enter_last_name();

	}

	@Given("user enter email adress")
	public void user_enter_email_adress() {
		c.user_enter_email_adress();
	    
	}

	@Given("user enter password")
	public void user_enter_password() {
		c.user_enter_password();

	}

	@Given("user enter conform password")
	public void user_enter_conform_password() {
		c.user_enter_conform_password();

	}

	@Given("user click on create an account button")
	public void user_click_on_create_an_account_button() {
		c.user_click_on_create_an_account_button();

	}

	@Then("validate user able to create account")
	public void validate_user_able_to_create_account() {
		assertTrue(c.validate_user_able_to_create_account());
		
	    
	}

}
