package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDuplicateLeadFunctionality {

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
		
		driver.findElement(By.linkText("Create Lead")).click();//click Create Lead
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sana Home Products");//company name
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");//first name
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rangavittal");//last name
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ram");//local first name
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Textile Business");//Description
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Business");//Title
		
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Textile");//Department name
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramya@gmail.com");//email
		
		
		driver.findElement(By.className("smallSubmit")).click();//click create lead button
		
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Jiya services");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jiya");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1= driver.getTitle();
		System.out.println(title1);
		
		
		
		
	}

}
