package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.vuse.com/gb/en/customer/account/create/");
		driver.manage().window().maximize();
		WebElement cokkies = driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));
		cokkies.click();
		WebElement age = driver.findElement(By.xpath("//button[@id=\"btn-entry-age-allow\"]"));
		age.click();
		WebElement gender = driver.findElement(By.xpath("//select[@id=\"gender\"]"));
		Select s =new Select(gender);
		s.selectByVisibleText("Male");
		WebElement first = driver.findElement(By.xpath("//input[@id = \"firstname\"]"));
		first.sendKeys("Vikas");
		WebElement last = driver.findElement(By.xpath("//input[@id = \"lastname\"]"));
		last.sendKeys("kumawat");
		WebElement email = driver.findElement(By.xpath("//input[@name = \"email\"]"));
		email.sendKeys("kumawatvikas476@gmail.com");
		WebElement dob = driver.findElement(By.xpath("//input[@name = \"dob\"]"));
		dob.sendKeys("09081995");
		WebElement adresss = driver.findElement(By.xpath("//input[@name= \"address-search\"]"));
		adresss.sendKeys("Near Rughji Chakki ");
		WebElement phone = driver.findElement(By.xpath("//input[@name=\"telephone\"]"));
		phone.sendKeys("7014161294");
		WebElement lable = driver.findElement(By.xpath("//label[@for=\"mobile_text_required\"]"));
		lable.click();
		String s = "my name is vikas kumawat";
		s.sp
		

	}

}
