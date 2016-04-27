package homework_3rd_week;

import java.rmi.Remote;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;



public class WrapperCls {

RemoteWebDriver driver;
		
		public void  LaunchBrowser(String Browser, String url ) {
			
			try {
				if (Browser.equalsIgnoreCase("firefox"))
						{
							driver= new FirefoxDriver();
						}
				else if (Browser.equalsIgnoreCase("chrome")) 
				{
					System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
					driver = new ChromeDriver();
				}
				
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
											
			} catch (WebDriverException e) {
		
				System.out.println("No Browser found");
			
			}
		}
		
		public void selectValueByIndex(String id, int value) {
			
			
			try {
				Select dropdown= new Select(driver.findElementById(id));
				
				dropdown.selectByIndex(value);
			} catch (NoSuchElementException e) {
				System.out.println("No Drop Down Values");
			}
			
		}
		
		public void switchToPrimaryWindow() {
			
			String ParentWindow = driver.getWindowHandle();
			
			driver.switchTo().window(ParentWindow);
			System.out.println(ParentWindow);
			
		}
		
		public void switchToLastWindow() {
			
			Set<String> Windows =driver.getWindowHandles();
			
			for (String AllWindow : Windows) {
				
				driver.switchTo().window(AllWindow);
						
			}
			
			System.out.println(driver.getCurrentUrl());
		
		}
		
		public void acceptAlert() {
			
			Alert ale = driver.switchTo().alert();
			
			ale.accept();
						
		}
		
		public void dismissAlert() {
			
			Alert ale= driver.switchTo().alert();
			
			ale.dismiss();
			
		}
		
		public void verifyUrl(String URL, String actualURL) {
			
			
					
			if (URL.equalsIgnoreCase(actualURL))
			{
				System.out.println("Actual URL is Matched");
			}
			else
			{
				System.out.println("Not Matched With Actual URL");
			}
			
		}
		
		public void verifyText(String Text, String AcutalText) {
			
			if (Text.equalsIgnoreCase(AcutalText))
			{
				System.out.println("Actual Text is Matched");
			}
			else
			{
				System.out.println("Not Matched With Actual URL");
			}
			
		}
		
		public void verifyTitle(String Title, String ActualTitle) {
			
			if (Title.equalsIgnoreCase(ActualTitle))
			{
				System.out.println("Actual Title is Matched");
			}
			else
			{
				System.out.println("Not Matched With Actual Title");
			}
					
		}
		
		public void clickByXpath(String Xpath) {
			
			driver.findElement(By.xpath(Xpath)).click();
			
		}
		
		public void enterByName(String Name, String Value) {
			
			driver.findElement(By.name(Name)).clear();
			driver.findElement(By.name(Name)).sendKeys(Value);
			
		}
		
		public void enterById(String ID, String Value) {
			
			driver.findElement(By.id(ID)).clear();
			driver.findElement(By.id(ID)).sendKeys(Value);
		}
		
		public void enterByClassName(String ClassName, String Value) {
			
			driver.findElement(By.className(ClassName)).clear();
			driver.findElement(By.className(ClassName)).sendKeys(Value);
			
		}
		
		public void switchToFirstFrame(String Index) {
			
			driver.switchTo().frame(0);
			
		}
		
		public void switchToFrameByElement(String TagName) {
			
			WebElement Frames = driver.findElement(By.tagName(TagName));
			
			driver.switchTo().frame(Frames);
			
		}
	}

	

