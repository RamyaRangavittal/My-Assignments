package week4.day2s;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingLearning {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
		
		ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
		
		driver.get("http://leaftaps.com/opentaps/control/main");//load the url
				
		
		driver.manage().window().maximize();//maximize the window
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");//Enter the username
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");//Enter password
		
		driver.findElement(By.className("decorativeSubmit")).click();//click Login
		
		driver.findElement(By.linkText("CRM/SFA")).click();//click CRM/SFA
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
	//window handle
	
	 Set<String> windowHandles= driver.getWindowHandles();
	 List <String> switchtochild= new ArrayList<String>(windowHandles);
	 driver.switchTo().window(switchtochild.get(1));
	 String title = driver.getTitle();
     System.out.println("Title of the Window:  "+ title);
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
     driver.switchTo().window(switchtochild.get(0));
   driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
     
	 //driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	// driver.switchTo().window(switchtochild.get(1));
	 
		//	 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
			 
   Set<String> windowHandles1 = driver.getWindowHandles();
   List<String> switchtochild1=new ArrayList<String>(windowHandles1);
   driver.switchTo().window(switchtochild1.get(1));
   driver.manage().window().maximize();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
   driver.switchTo().window(switchtochild.get(0));
   driver.findElement(By.xpath("//a[text()='Merge']")).click();
   Alert alert= driver.switchTo().alert();
   alert.accept();
   System.out.println("Title of the resulting page  "+driver.getTitle());
   driver.quit();
	
	
	

	}

}
