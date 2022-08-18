package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class InputComponents {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
				
				ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
				driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");//load the url
				driver.manage().window().maximize();//maximize the window
				
				driver.findElement(By.xpath("//div[@class='grid formgrid']//input")).sendKeys("Ramya");
			    driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys(", India");
			    Thread.sleep(2000);
			    
			   WebElement findElement1 = driver.findElement(By.xpath("(//div[@class='grid formgrid']//div)[3]"));
			   System.out.println(findElement1.isEnabled());
			   
			   
			    driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
			  
				
			 WebElement t = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
			 String s=t.getAttribute("value");
			 System.out.println(s);
			 driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("ramya@gmail.com");
			 
			 driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys(Keys.TAB);
			
			 
			 driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("I am a Selenium student");
			 
			 
			 driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("My name is Ramya");
			 driver.findElement(By.xpath("//div[contains(@class,'col-12 mb-2')]//input[1]")).sendKeys(Keys.ENTER);
			 
			 WebElement error = driver.findElement(By.xpath(" (//div[contains(@class,'col-12 mb-2')])[2]"));
			
			 String s1 =error.getText();
			 System.out.println(s1);
			 
					 
			 driver.findElement(By.xpath("//span[@class='ui-float-label']//input[1]")).click();
			 String text = driver.findElement(By.xpath("//label[text()='Username']")).getText();
			
			System.out.println(text);
			driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']//input")).sendKeys("Ramya");
			driver.findElement(By.id("createLeadForm_industryEnumId"));
			
			
			
			
			
			
			
			
			
			 
	}
}
