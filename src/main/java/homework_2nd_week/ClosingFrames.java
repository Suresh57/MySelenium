package homework_2nd_week;


import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingFrames {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		
		
		driver.switchTo().frame("childIframe");
		
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		
		driver.findElementByXPath("/html/body/div[3]/p/button").click();
		
		driver.switchTo().defaultContent();
		
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		
		///html/body/div[2]/p/button
		
	}

}
