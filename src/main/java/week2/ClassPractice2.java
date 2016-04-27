package week2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassPractice2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		
		driver.findElementByTagName("button").click();
		
		Alert ale = driver.switchTo().alert();
		
		ale.dismiss();
		
		if (driver.findElementByXPath("//*[@id='demo']").getText().contains("OK"))
			
		{
			System.out.println("Clicked OK");
		}
		
		else 
			
			System.out.println("Clicked Cancelled");
	}
}
