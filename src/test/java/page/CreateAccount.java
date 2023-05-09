package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class CreateAccount extends Base {


	public void user_click_on_create_an_acccunt() {
		WebElement Cbtn = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a"));
		Cbtn.click();

	}

	public void user_enter_first_name() {
		WebElement fname = driver.findElement(By.xpath("//input[@id=\"firstname\"]"));
		fname.sendKeys(prop.getProperty("firstname"));

	}
	public void user_enter_last_name() {
		WebElement lname = driver.findElement(By.xpath("//input[@id=\"lastname\"]"));
		lname.sendKeys(prop.getProperty("lastname"));

	}

	public void user_enter_email_adress() {
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email_address\"]"));
		email.sendKeys(prop.getProperty("email"));
	
	}

	public void user_enter_password() {
		WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pass.sendKeys(prop.getProperty("password"));
	    
	}

	public void user_enter_conform_password() {
		WebElement cpass = driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]"));
		cpass.sendKeys(prop.getProperty("password"));

	}
	public void user_click_on_create_an_account_button() {
		WebElement btn = driver.findElement(By.xpath("//button[@class=\"action submit primary\"]"));
		btn.click();
	    
	}

	public boolean validate_user_able_to_create_account() {
		WebElement msg = driver.findElement(By.xpath("//div[@data-bind = \"html: $parent.prepareMessageForHtml(message.text)\"]"));
		 return  msg.isDisplayed();
		
		

	}

}
