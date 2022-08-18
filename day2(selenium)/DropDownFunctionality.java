package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownFunctionality {
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
				
				driver.findElement(By.className("inputBox")).sendKeys("ramya@gmail.com");//email
				
				
				//driver.findElement(By.className("smallSubmit")).click();//click create lead button
				
				//String title= driver.getTitle();
			//	System.out.println(title);
				
				
				
				WebElement source= driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select opt=new Select (source);
				opt.selectByIndex(2);
				
				WebElement currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
				Select option=new Select (currency);
				option.selectByValue("DZD");
				
				WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select option1=new Select (ownership);
				option1.selectByVisibleText("Corporation");
				
			}

		}



