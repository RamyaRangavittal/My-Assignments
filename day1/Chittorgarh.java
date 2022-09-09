package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.chittorgarh.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("navbtn_stockmarket")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@href='/newportal/stock-nse-bulk-deals.asp']")).click();
		 Thread.sleep(2000);
		List< WebElement> rowsize = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tbody/tr"));
		 
		 int rsize= rowsize.size();
		 System.out.println(rsize);
		 List<String> rows =new ArrayList <String>();
		 
		 
		 for(int i=1;i<=rsize;i++) {
			 String text = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tbody/tr["+i+"]/td[3]")).getText();
			// System.out.println(text);
			 rows.add(text);
		 }
			 System.out.println(rows);
			 Collections.sort(rows);
			 List<String> sortedRows =new ArrayList <String>();
			 
			 Set <String> uniqueRows = new LinkedHashSet <String>(sortedRows);
			 
			 if(sortedRows.equals(uniqueRows)) {
				 System.out.println("There is no Duplicate values");
			 }
				 else {
					 System.out.println("There is Duplicate values");
					 
				 }
					 
				 
				 
				 
			 }
			 
			 
			 
			 
			 
		 
		 
		 
		 
		 }


