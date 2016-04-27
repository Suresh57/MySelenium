package homework_2nd_week;

import java.util.List;

import org.apache.commons.collections.ListUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoOfFrames {

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
			
			System.out.println("Web Page Title: "+ driver.getTitle());
			
			//driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[1]"));
			
			
			WebElement frame1  = driver.findElementByXPath("/html/body/iframe[1]");
			
			driver.switchTo().frame(frame1);
			
			System.out.println("Frame 1: " + driver.getTitle());
			
			driver.switchTo().defaultContent();
			
			WebElement frame2  = driver.findElementByXPath("/html/body/iframe[2]");
			
			driver.switchTo().frame(frame2);
			
			System.out.println("Frame 2: "+ driver.getTitle());
			
			driver.switchTo().defaultContent();
		
			
			
			WebElement frame3  = driver.findElementByXPath("/html/body/iframe[3]");
			
			driver.switchTo().frame(frame3);
			
			System.out.println("3"+driver.getTitle());
			
			
			
	}

}
