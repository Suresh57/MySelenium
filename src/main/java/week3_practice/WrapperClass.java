package week3_practice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WrapperClass {
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
	
	public void UserName(String id, String Username) {
		
		try {
			driver.findElementById(id).clear();
			driver.findElementById(id).sendKeys(Username);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Given Element is wrong"+id);
		}
		
	}
	
	public void Password(String id, String Password) {
		try {
			driver.findElementById(id).clear();
			driver.findElementById(id).sendKeys(Password);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("No Password");
		}
		
	}
	
	public void Click(String id) {
		
		driver.findElement(By.className(id)).click();
	}
	
	public void ClickLink(String Xpath) {
		
		try {
			driver.findElement(By.xpath(Xpath)).click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Nolink");
		}
		
	}
	
	public void CreateContact(String Text) {
		
		driver.findElement(By.linkText(Text)).click();
		
	}
	
	public void SendingKeys(String ID, String ID1, String FirstName, String LastName) {
		
		driver.findElement(By.id(ID)).clear();
		driver.findElement(By.id(ID)).sendKeys(FirstName);
		driver.findElement(By.id(ID1)).clear();
		driver.findElement(By.id(ID1)).sendKeys(LastName);
	}
	
	public void Submit(String button) {
		
		driver.findElement(By.className(button)).click();
	}
	
	public void  Logout(String id) {
		
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	public void WindowClose() {
		
		driver.close();
		
	}
	
}
