package week4.day2s;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get(" https://www.nykaa.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   WebElement findElement = driver.findElement(By.xpath("//a[text()='brands']"));
   Actions action = new Actions(driver);
   action.moveToElement(findElement).perform();
   driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//div[@class='css-ov2o3v']//a")).click();
   driver.findElement(By.className("sort-name")).click();
   
   driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
   driver.findElement(By.xpath("//div[@class='css-w2222k']//div")).click();
   driver.findElement(By.xpath("(//div[@class=' css-b5p5ep'])[2]")).click();
   driver.findElement(By.xpath("//div[@class=' css-b5p5ep']")).click();
   driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
   driver.findElement(By.xpath("//span[text()='Concern']")).click();
   driver.findElement(By.xpath("(//label[@for='checkbox_Color Protection_10764']//div)[2]")).click();
   driver.findElement(By.xpath("//div[@class='css-43m2vm']//img[1]")).click();
   //window handle
   Set<String> windowHandling = driver.getWindowHandles();
   List <String> childWindow = new ArrayList<String>(windowHandling);
   driver.switchTo().window(childWindow.get(1));
   System.out.println(driver.getTitle());
   driver.findElement(By.xpath("//select[@title='SIZE']")).click();
   driver.findElement(By.xpath("//option[@value='0']")).click();
   String  mrp= driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
   System.out.println(mrp);
driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
driver.findElement(By.className("cart-count")).click();
//Thread.sleep(2000);
//
//String grandTotal= driver.findElement(By.xpath("//p[text()='₹259']")).getText();
//System.out.println("Total"+grandTotal);
//
//
//driver.findElement(By.xpath("//div[@class='css-15vhhhd e25lf6d4']")).click();

//driver.findElement(By.xpath("(//button[contains(@class,'btn full')])[2]")).click();
//String grandT2 = driver.findElement(By.xpath("(//div[@class='value']//span)[2]")).getText();
//if(grandTotal.equals(grandT2))
//{
//	System.out.println("Both total are equal");
//	}else {
//		System.out.println("Both total are not equal");
//		
//	}
driver.quit();
	}

}
