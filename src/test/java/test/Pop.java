package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pop {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(option);
			driver.get("https://www.linkedin.com/home");
			driver.manage().window().maximize();
			WebElement username = driver.findElement(By.xpath("//input[@id=\"session_key\"]"));
			username.sendKeys("kumawatvikas476@gmail.com");
			WebElement password = driver.findElement(By.xpath("//input[@id=\"session_password\"]"));
			password.sendKeys("Vikas1995@");
			WebElement lbtn = driver.findElement(By.xpath("//button[@data-id=\"sign-in-form__submit-btn\"]"));
			lbtn.click();
			
			
		}
		
			
			
			


}
