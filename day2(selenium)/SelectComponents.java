package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectComponents {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
					
					ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
					driver.get("https://www.leafground.com/select.xhtml");//load the url
					driver.manage().window().maximize();//maximize the window
					
					
							WebElement findElement = driver.findElement(By.className("ui-selectonemenu"));
							Select opt1= new Select(findElement);
							opt1.selectByVisibleText("Selenium");
							
							driver.findElement(By.xpath("//div[contains(@class,'ui-selectonemenu-trigger ui-state-default')]//span")).click();
							
							driver.findElement(By.xpath("//li[@data-label='India']")).click();
							Thread.sleep(2000);
							
							
								 driver.findElement(By.xpath("(//div[contains(@class,'ui-selectonemenu-trigger ui-state-default')]//span)[2]")).click();
								
								 driver.findElement(By.xpath("//li[@data-label='Chennai']")).click();
								
								 driver.findElement(By.xpath("//button[@role='button']//span")).click();
									Thread.sleep(2000);
								
								 driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
								 
										 driver.findElement(By.xpath("(//div[contains(@class,'ui-selectonemenu-trigger ui-state-default')]//span)[3]")).click();
										 Thread.sleep(2000);
										 driver.findElement(By.xpath("//li[@data-label='English']")).click();
										 Thread.sleep(2000);
												 driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();
												 Thread.sleep(2000);
												 driver.findElement(By.xpath("//li[@data-label='Two']")).click();
	}

}
