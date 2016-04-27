package week2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyNameLink {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElementById("lst-ib").sendKeys("suresh",Keys.ENTER);
		
		Thread.sleep(5000);
		
		List<WebElement> links = driver.findElementsByTagName("a");
		
		System.out.println(links.size());
		int s=0;
		for (WebElement names : links) {
			
			if (names.getText().contains("suresh") || names.getText().contains("Suresh"))
			{
				System.out.println(names.getText());
				s++;
			}
			
		}
		System.out.println(s);
	}
	

}
