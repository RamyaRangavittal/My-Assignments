package marathan.tc1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException, IOException {

		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();

	 driver.get("https://in.bookmyshow.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.tagName("input")).sendKeys("hyderabad");
	
	driver.findElement(By.xpath("//li[@class='sc-dTLGrV eqBsHh']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
	driver.findElement(By.xpath("//input[@class='sc-jvEmr elijMA']")).sendKeys("thiruchitrambalam");
	driver.findElement(By.xpath("//div[@class='sc-fQkuQJ hqIzUw']")).click();
	driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
//	
	String cinema = driver.findElement(By.xpath("//a[@class='__venue-name']")).getText();
	System.out.println(cinema);
	//
//
//	
	System.out.println("parking is available");
	driver.findElement(By.xpath("//a[@class='__venue-name']")).click();
	driver.findElement(By.xpath("(//div[@class='__text'])[3]")).click();
	driver.findElement(By.xpath("//div[@class='bar-btn _primary']")).click();
	driver.findElement(By.xpath("//li[text()='1']")).click();
	driver.findElement(By.xpath("//div[text()[normalize-space()='Select Seats']]")).click();
	driver.findElement(By.xpath("//a[@class='_available']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='Sign me Up!']")).click();
	driver.findElement(By.xpath("//span[@id='btnSTotal_reserve']")).click();
	Thread.sleep(2000);
	
	String subTotal = driver.findElement(By.className("__sub-total")).getText();
	System.out.println(subTotal);
	 Thread.sleep(2000);
		File source = driver.getScreenshotAs(OutputType.FILE); 
	    File destination = new File("./snaps/ticket.png"); 
	    FileUtils.copyFile(source, destination);
	    
	    driver.close();
	 
	}

}
