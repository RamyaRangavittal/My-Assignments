package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookNewAccountCreation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
		
		ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
		
		driver.get("https://en-gb.facebook.com/");//load the url
		
		driver.manage().window().maximize();//maximize the window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Amrutha");
		driver.findElement(By.name("lastname")).sendKeys("Indrajith");
		
		
		driver.findElement(By.xpath("//form[@id='reg']//input[@name='reg_email__']"));
		
		WebElement Day = driver.findElement(By.id("day"));
		Select option1= new Select(Day);
		option1.selectByValue("4");
		
		WebElement month = driver.findElement(By.id("month"));
		Select option2=new Select(month);
		option2.selectByValue("12");
		
		WebElement year = driver.findElement(By.id("year"));
		Select option3=new Select(year);
		option3.selectByValue("2010");
		
		
		
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//label")).click();
		
	}

}
