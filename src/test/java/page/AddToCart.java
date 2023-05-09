package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class AddToCart extends Base  {
    public void user_click_on_search_button() {
    	WebElement btn = driver.findElement(By.xpath("//button[@aria-controls=\"SearchDrawer\"]"));
    	btn.click();
    	   
	}
    public void user_search_for_eliquids() {
    	WebElement search = driver.findElement(By.xpath("//input[@aria-label=\"Search\"]"));
    	search.sendKeys(prop.getProperty("search"));

	}
    
    public void click_on_productpage() {
    	WebElement productpage = driver.findElement(By.xpath("//div[@class=\"overlay\"]"));
    	productpage.click();
	    
	}
    public void click_on_add_to_cart_of_quantity_item() {
    	WebElement addtocartbtn = driver.findElement(By.xpath("//button[@aria-label=\"Add to cart\"]"));
    	addtocartbtn.click();
	    
	}
    public void user_click_on_age_button() {
    	WebElement age = driver.findElement(By.xpath("//a[@class=\"btn accept\"]"));
    	age.click();
 	   
	}
    public void user_click_on_serach_button1() {
    	WebElement serbtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    	serbtn.click();
    	Ass

	}

    

    
    

	
	    


}
