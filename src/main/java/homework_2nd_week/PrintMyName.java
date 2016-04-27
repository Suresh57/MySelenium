package homework_2nd_week;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintMyName {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	driver.findElementById("lst-ib").sendKeys("suresh",Keys.ENTER);
	
	Thread.sleep(50000);
	
	List<WebElement> links = driver.findElementsByTagName("a");
	
	for (WebElement myname : links) {
		
			if(myname.getAttribute("href").contains("suresh"))
			{
				
			System.out.println(myname.getAttribute("href"));
		
			//http://layout.jquery-dev.com/demos/iframe_local.html
			}
		
	}
	
	
	}

}
	
