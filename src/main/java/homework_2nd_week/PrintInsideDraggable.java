package homework_2nd_week;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintInsideDraggable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/");
		
		driver.findElementByLinkText("Draggable").click();
		
		WebElement frame = driver.findElementByClassName("demo-frame");
		
		driver.switchTo().frame(frame);
		
		System.out.println(""+ driver.findElementById("draggable").getText());
		
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Droppable").click();

	}

}
