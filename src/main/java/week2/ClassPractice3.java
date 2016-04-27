package week2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassPractice3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElementByLinkText("Contact Us").click();
		
		System.out.println(driver.getTitle());
		
		Set <String> allwindow =driver.getWindowHandles();
		
		for (String newwindow : allwindow) {
			
			driver.switchTo().window(newwindow);
			System.out.println("URL"+newwindow);
		}
		System.out.println("Current URL:" + driver.getTitle());
		driver.close();
		Thread.sleep(3000);
		driver.quit();
	}
}
