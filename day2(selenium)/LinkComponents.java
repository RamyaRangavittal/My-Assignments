package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkComponents {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
		
		ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
		
		driver.get("https://www.leafground.com/link.xhtml");//load the url
				
		
		driver.manage().window().maximize();//maximize the window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ui-link ui-widget']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")).getAttribute("href"));
		
		

	}

}
