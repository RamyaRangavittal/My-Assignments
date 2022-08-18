package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class CheckBoxTest {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
		
		ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
		
		driver.get("https://www.leafground.com/checkbox.xhtml");//load the url
		driver.manage().window().maximize();//maximize the window
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')]//div)[2]")).click();
		
				driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
				
		
						driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']//div)[2]")).click();
						driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
						driver.findElement(By.xpath("(//div[@class='ui-toggleswitch ui-widget']//div)[2]")).click();
						WebElement f1 = driver.findElement(By.xpath("(//div[@class='col-12'])[5]"));
						boolean e = f1.isEnabled();
						System.out.println(e);
						
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
						driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[10]")).click();
						driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[12]")).click();
						
						Thread.sleep(2000);
						driver.close();
						
						
						
	}

}
