package week4.day2s;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
		
		ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
		
		driver.get("https://login.salesforce.com/");//load the url
				
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		 Set<String> windowHandles1 = driver.getWindowHandles();
		    List<String> switchtochild1=new ArrayList<String>(windowHandles1);
		    driver.switchTo().window(switchtochild1.get(1));
		    driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		    String title1 = driver.getTitle();
		    System.out.println("second window:  " +title1);
		    driver.switchTo().window(switchtochild1.get(0));
		    driver.quit();


	}

}
