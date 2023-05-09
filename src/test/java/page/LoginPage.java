package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class LoginPage extends Base {
	public void user_enter_username_and_password() {
		WebElement username = driver.findElement(By.xpath("//input[@id=\"session_key\"]"));
		waitForExpeectedElement(username,10);
		username.sendKeys(prop.getProperty("username"));
		WebElement password = driver.findElement(By.xpath("//input[@id=\"session_password\"]"));
		password.sendKeys(prop.getProperty("password"));
	}
	public void click_on_login_button() {
	
		WebElement lbtn = driver.findElement(By.xpath("//button[@data-id=\"sign-in-form__submit-btn\"]"));
		lbtn.click();
	}

}
