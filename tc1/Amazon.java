package marathan.tc1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
public static void main(String[] args) throws InterruptedException, IOException {
	

	 WebDriverManager.chromedriver().setup(); 
	 ChromeDriver driver=new ChromeDriver();

 driver.get("https://www.amazon.in/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//span[text()=' for boys']")).click();
 String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
 System.out.println(text+" Bags for Boys");
 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[6]")).click();
 
 String text1 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
 System.out.println(text1+" Bags for Boys");
 if(text.equals(text1)) {
	 System.out.println("The results have not reduced ");
 }else {
	 System.out.println("The results have got reduced ");
	 driver.findElement(By.className("a-dropdown-prompt")).click();
	 driver.findElement(By.linkText("Newest Arrivals")).click();
	 String generic = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText();
	// System.out.println(generic);
	 String discount = driver.findElement(By.xpath("//span[@class='a-letter-space']/following-sibling::span")).getText();
	 System.out.println("name"+generic +"discount price"+discount);
	 
	 System.out.println("There is no deal of the day");
	 driver.findElement(By.xpath("//img[@class='s-image']")).click();
	 //window handle
	 Set<String> windowHandles= driver.getWindowHandles();
	 List <String> switchtochild= new ArrayList<String>(windowHandles);
	 driver.switchTo().window(switchtochild.get(1));
	 String priceNew = driver.findElement(By.xpath("//span[contains(@class,'a-size-large a-color-price')]")).getText();
	 System.out.println("Discount price in child window"+priceNew);
	 if(priceNew.equalsIgnoreCase(generic)) {
		 System.out.println("Prices are same");
		 
	 }else
	 {
		 System.out.println("Prices are  not same");
		 
	 }
	 Thread.sleep(2000);
		File source = driver.getScreenshotAs(OutputType.FILE); 
	    File destination = new File("./snaps/amazon.png"); 
	    FileUtils.copyFile(source, destination);
	    driver.quit();
	 
	 
 }
 }
 
 
 
}
