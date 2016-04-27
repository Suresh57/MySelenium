package homework_2nd_week;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("http://popuptest.com/");
		
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		
		String ParentWindow = driver.getWindowHandle();
		
		Set<String> AllWindow = driver.getWindowHandles();
		 
		 	 
		 for (String x1 : AllWindow) {
			
			 driver.switchTo().window(x1);
			 
			  if(!x1.equals(ParentWindow))
			 
			 {
				 Thread.sleep(500);
				 driver.close();
			
			 }
		 
		 }
	
		 driver.switchTo().window(ParentWindow);
		 System.out.println(ParentWindow);
		 System.out.println(driver.getTitle());
	}
		  
		
	}
		
		


