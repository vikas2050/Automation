package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionevent {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		WebElement product = driver.findElement(By.xpath("//span[@class=\"nav_item_name\"]"));
		Actions a = new Actions(driver);
		WebElement status = driver.findElement(By.xpath("//a[@class=\"menu-item-status\"]"));
		a.moveToElement(product);
		a.click(status).build().perform();
		
		
		
		

	}

}
