package week4.day2s;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleLearn {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();// Webdriver setup for chrome
		
		ChromeDriver driver=new ChromeDriver();//Creating objects for chrome driver
		
		driver.get("https://www.leafground.com/window.xhtml");//load the url
				
		
		driver.manage().window().maximize();//maximize the window
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
	    System.out.println(windowHandles.size());
	    for (String w : windowHandles) {
			System.out.println(w);
		}
	    List<String> switchtoChild =new ArrayList <String> (windowHandles);
	    driver.switchTo().window(switchtoChild.get(2));
	    String title = driver.getTitle();
	    System.out.println("first window"+title);
	    
	    Set<String> windowHandles1 = driver.getWindowHandles();
	    List<String> switchtochild1=new ArrayList<String>(windowHandles1);
	    driver.switchTo().window(switchtochild1.get(1));
	    String title1 = driver.getTitle();
	    System.out.println("second window" +title1);
	    driver.close();
	    driver.switchTo().window(switchtochild1.get(0));
	    driver.close();
	    
	    
		
		

	}

}
