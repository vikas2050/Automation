package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement product = driver.findElement(By.xpath("//button[@id=\"custom\"]"));
		product.click();
		
		List<WebElement>dropdown=driver.findElements(By.xpath("//ul[@class=\"dropdown-menu show\"]/li/b"));
		System.out.println(dropdown.size());
		Select s = new Select(product);
		s.
		
	
		
		for (WebElement ele:dropdown){
			String optionValue = ele.getText();
		
			if(optionValue.equals("span")){
				ele.click();
				
			}
			
		}
		driver.close()
		
	

	}

}
