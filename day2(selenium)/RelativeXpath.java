package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
		
		ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
		
		driver.get("http://leaftaps.com/opentaps/control/main");//load the url
				
		
		driver.manage().window().maximize();//maximize the window
		
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Sana Home Products");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ramya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Rangavittal");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title= driver.getTitle();
		System.out.println(title);
	}

}
