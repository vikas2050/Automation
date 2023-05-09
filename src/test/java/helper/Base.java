package helper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	 public static Properties prop;
	static {
		try {
			FileInputStream file = new FileInputStream("Testdata\\TestData.properties");
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}
	
	
		
	 public void waitForExpeectedElement(WebElement ele,int timeout) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 wait.until(ExpectedConditions.visibilityOf(ele));
		 
	 }
	 public void waitForAlert(int timeout) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 wait.until(ExpectedConditions.alertIsPresent());
		 
	 }
	 public void waitForElementToClickable(WebElement ele ,  int timeout) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 wait.until(ExpectedConditions.elementToBeClickable(ele));
	 
	 }
	 public void mouseHover(WebElement ele) {
		 Actions a = new Actions(driver);
		 a.moveToElement(ele).build().perform();
		  
	 }
	 public void mouseHoverClick(WebElement ele) {
		 Actions a = new Actions(driver);
		 a.moveToElement(ele)
		 a.click().build().perform();
	 }
	 
	 public void selectAlertPopup() {
		Alert a = driver.switchTo().alert();
		a.accept();
	 }
	 
	 public void selectByVisibleText(WebElement ele,String value) {
		 Select s = new Select(ele);
		 s.deselectByVisibleText(value);
		
	 }
	 public void selectByIndex(WebElement ele ,int index) {
		 Select s = new Select(ele);
		 s.deselectByIndex(index);
	 }
	 public void selectByValue(WebElement ele, String value) {
		 Select s = new Select(ele);
		 s.deselectByValue(value);
	 }
	}
	
	 
	 
	 
	 
	 
	 
	 
	
	
	

