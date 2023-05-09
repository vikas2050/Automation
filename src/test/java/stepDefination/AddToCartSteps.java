package stepDefination;

import helper.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AddToCart;

public class AddToCartSteps extends Base {
	AddToCart cart = new AddToCart();
	@Given("user launch site url")
	public void user_launch_site_url() {
		setup();
	}

	@When("user click on Search button")
	public void user_click_on_search_button() {
		cart.user_click_on_search_button();
	    
	}

	@When("user search for eliquids")
	public void user_search_for_eliquids() {
        cart.user_search_for_eliquids();  
	}

	@When("click on add to cart button")
	public void click_on_add_to_cart_button() {
		cart.click_on_add_to_cart_button();

	}
	@When("click on productpage")
	public void click_on_productpage() {
		cart.click_on_productpage();
	}


	@When("click on add to cart of quantity item")
	public void click_on_add_to_cart_of_quantity_item() {
		cart.click_on_add_to_cart_of_quantity_item();
	    
	}

	@Then("validate user able to add product in cart")
	public void validate_user_able_to_add_product_in_cart() {
	   
	}
	@When("user click on age button")
	public void user_click_on_age_button() {
		cart.user_click_on_age_button();
	   
	}
	@Given("user click on serach button1")
	public void user_click_on_serach_button1() {
		cart.user_click_on_serach_button1();

	}


}
