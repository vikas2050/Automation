package stepDefination;

import helper.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginPageSteps extends Base  {
	LoginPage login = new LoginPage();
	@Given("user lanuch site URL")
	public void user_lanuch_site_url() {
	setup();
		
	}
	    

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		login.user_enter_username_and_password();
		
	}


	@And("click on login button")
	public void click_on_login_button() {
		login.click_on_login_button();
	}


	@Then("Validate success login")
	public void validate_success_login() {
	}
	
	



}
