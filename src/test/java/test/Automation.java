package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		 WebElement userName = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		 userName.sendKeys("kumawatvikas476");
		 WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		 password.sendKeys("Vikas1995");
		 WebElement login = driver.findElement(By.xpath("//input[@name=\"login-button\"]"));
		 login.click();
		 
		 
		 
		 
		
		

	}

}
