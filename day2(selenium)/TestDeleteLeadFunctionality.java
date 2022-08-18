package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDeleteLeadFunctionality {
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
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();// click on PhoneNumber
				Thread.sleep(2000);
				
				driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");//Enter phonenumber to search
				
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(2000);
				
				String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
				System.out.println(text);
				
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
				
				driver.findElement(By.className("subMenuButtonDangerous")).click();
				driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();//click FindLeads
				
				driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(text);
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(2000);
				WebElement records = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']//div[1]"));
				String s= records.getText();
				System.out.println(s);
			
				driver.close();
	}

}
