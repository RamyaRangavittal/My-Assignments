package marathan.tc1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import com.mongodb.MapReduceCommand.OutputType;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notifications");
	    // Launch Firefox / Chrome
	    ChromeDriver driver = new ChromeDriver(option);

		 driver.get("https://www.redbus.in//");
		 driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		 driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		 driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		 driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		 driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		 driver.findElement(By.xpath("//td[text()='8']")).click();
		 driver.findElement(By.id("search_btn")).click();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(text);
		WebElement sleeperClick = driver.findElement(By.xpath("//label[@for='bt_SLEEPER']"));
		 driver.executeScript("arguments[0].scrollIntoView();", sleeperClick);
		 sleeperClick.click();
		String text2 = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println(text2);
		//Thread.sleep(2000);
		driver.findElement(By.xpath(("(//div[@class='button view-seats fr'])[2]"))).click();
				 //driver.executeScript("arguments[0].scrollIntoView();", viewSeats);
		//viewSeats.click();
		
//		File source = driver.getScreenshotAs(OutputType.FILE); 
//	    File destination = new File("./snaps/seats.png"); 
//	    FileUtils.copyFile(source, destination);
		Thread.sleep(2000);
		File source = driver.getScreenshotAs(OutputType.FILE); 
	    File destination = new File("./snaps/seats.png"); 
	    FileUtils.copyFile(source, destination);
	    driver.close();
	     
	}

}
