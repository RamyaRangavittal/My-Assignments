package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasic {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
		
		ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
		
		driver.get("http://leaftaps.com/opentaps/control/main");//load the url
				
		
		driver.manage().window().maximize();//maximize the window
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");//Enter the username
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");//Enter password
		
		driver.findElement(By.className("decorativeSubmit")).click();//click Login
		
		driver.findElement(By.linkText("CRM/SFA")).click();//click CRM/SFA
		
		driver.findElement(By.linkText("Leads")).click();// click Leads
		
		String title= driver.getTitle();
		System.out.println(title);
		
		
		driver.close();
		
		
		
		

	}

}
