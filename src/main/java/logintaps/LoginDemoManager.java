package logintaps;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginDemoManager {

	public static void main(String[] args) {
		
		//Launch Firefox
		
		FirefoxDriver driver= new FirefoxDriver();
		
		// Getting URL
		driver.get("http://182.74.137.194:8280/egi/login/securityLogin.jsp;jsessionid=8EE0AB1FB250736C9791A0B19690E4C3");
		
		System.out.println(driver.getTitle());
		
		// Enter User Name
		
		driver.findElementById("j_username").sendKeys("ASSTCONE");
		
		// Enter Password
		
		driver.findElementById("j_password").sendKeys("804MQU");

		// Click Login
		
		driver.findElementByClassName("buttongeneral").click();
		
		// Print Title
		
		System.out.println(driver.getTitle());
		
		//*[@id="form"]/table/tbody/tr/td/div[2]/div/div[2]/a[3]
		
		//*[@id="form"]/table/tbody/tr/td/div[2]/div/div[2]/a[3]
		
		driver.findElementByXPath("//*[@id='form']/table/tbody/tr/td/div[2]/div/div[2]/a[3]").click();
		
		// Close Window
		
		driver.close();
		
	
	}

}
