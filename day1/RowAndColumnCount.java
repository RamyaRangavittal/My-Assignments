package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RowAndColumnCount {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://html.com/tags/table/");
		 driver.manage().window().maximize();
		 List<WebElement> rSize = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
		 int rowSize = rSize.size();
		 System.out.println("Row Size is: "+ rowSize);
		 
		 List<WebElement> cSize = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr/th"));
		 int columnSize = cSize.size();
		 System.out.println("Column size is: "+ columnSize);
		 
	}

}
