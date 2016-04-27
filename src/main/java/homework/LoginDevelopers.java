package homework;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginDevelopers {
	public static void main(String[] args) {

		FirefoxDriver login= new FirefoxDriver();

		// URL
		
		login.get("https://developer.salesforce.com/");
		
		// Click Login
		
		login.findElementById("login-button").click();
		
		// Enter User Name
		
		login.findElementById("username").sendKeys("suresh.n@egoverntments.org");
		
		// Enter Password
		
		login.findElementById("password").sendKeys("Permission@12");
		
		// Click Login
		
		login.findElementById("Login").click();
		

	}
}
