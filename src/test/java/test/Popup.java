package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		WebElement btn = driver.findElement(By.xpath("//button[@id=\"promptBox\"]"));
		btn.click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("Automation");
		driver.manage().timeouts().implicitlyWait(null)

	}

}
