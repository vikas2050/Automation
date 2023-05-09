package test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandler1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String window = driver.getWindowHandle();
		Set<String>windowhendle = driver.getWindowHandles();
		for(String s: windowhendle) {
			if(!s.equals(window)) {
				driver.switchTo().window(s);
				String windowtitle =driver.getTitle()
						break;

	}

}
