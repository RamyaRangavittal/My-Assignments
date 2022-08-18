package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
		
		ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
		
		driver.get("https://www.leafground.com/button.xhtml");//load the url
		driver.manage().window().maximize();//maximize the window
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();//click button
		Thread.sleep(2000);
		
		String title= driver.getTitle();
			System.out.println(title);//get title
			
	driver.navigate().back();
	Thread.sleep(2000);
	
			System.out.println(driver.findElement(By.xpath("(//div[@class='card'])[2]/button")).isEnabled());
			
			
			System.out.println(driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
			Thread.sleep(2000);
			
			WebElement f1 = driver.findElement(By.xpath("(//button[@id='j_idt88:j_idt96']//span)[2]"));
			String s= f1.getCssValue("color");
			
			System.out.println("colour" +s);
			
			
					WebElement f2 = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
			
			Dimension size = f2.getSize();
			System.out.println(size);
			
			driver.findElement(By.xpath("//span[text()='Success']")).click();
			WebElement f3 = driver.findElement(By.xpath("//span[text()='Success']"));
			String cssValue = f3.getCssValue("color");
			System.out.println(cssValue);
			driver.findElement(By.xpath("//span[text()='Image']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@class='grid formgrid']")).click();
			
			driver.close();
			
			
	}

}
