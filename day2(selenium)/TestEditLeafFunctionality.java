package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestEditLeafFunctionality {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
		
		ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
		
		driver.get("http://leaftaps.com/opentaps/control/main");//load the url
				
		
		driver.manage().window().maximize();//maximize the window
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");//Enter the username
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");//Enter password
		
		driver.findElement(By.className("decorativeSubmit")).click();//click Login
		
		driver.findElement(By.linkText("CRM/SFA")).click();//click CRM/SFA
		
		driver.findElement(By.linkText("Leads")).click();// click Leads
		
		
		
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();//click FindLeads
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ramya");//Enter First name
		
			
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();//click findLeads
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		
		String title= driver.getTitle();
		System.out.println(title);// Display Title
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();//Click Edit Button
		
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();//Clear company name
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Infosys");//Give new company name
		
	
		driver.findElement(By.className("smallSubmit")).click();//click update*/
		
		driver.close();
		
		
		
	}

}
