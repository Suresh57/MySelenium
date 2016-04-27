package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassPractice1 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	List<WebElement> links = driver.findElementsByTagName("a");
	
	
	System.out.println(links.size());
	
	for (WebElement quotes : links) {
		if(quotes.getText().contains("c") && quotes.getLocation().getX()>50 && quotes.getSize().width >20)
		{
			quotes.click();
			break;
		}
	}
	
	
	}
}
