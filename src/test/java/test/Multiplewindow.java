package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplewindow {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement btn = driver.findElement(By.xpath("//button[@id=\"newTabsBtn\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", btn);
		driver.manage().window().maximize();
		String window = driver.getWindowHandle();
		Set <String> windowHandle = driver.getWindowHandles();
		for(String s: windowHandle) {
			if(!s.equals(window)) {
				driver.switchTo().window(s);
				String windowTitle = driver.getTitle();
				if(windowTitle.contains("Basic Controls")) {
					WebElement firstname = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
					firstname.sendKeys("Vikas");
				
			}
				
				break;
			}
		}
	}
}

