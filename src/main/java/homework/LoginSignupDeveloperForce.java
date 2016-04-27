package homework;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginSignupDeveloperForce {
	public static void main(String[] args) {

		FirefoxDriver force= new FirefoxDriver();

		// URL
		
		force.get("https://developer.salesforce.com/");
		
		// Sign Up
		
		force.findElementByPartialLinkText("Sign Up").click();
		
		// First Name
		
		force.findElementById("first_name").sendKeys("Suresh");
		
		//Last Name
		
		force.findElementById("last_name").sendKeys("Nagarajan");
		
		// Enter Mail
		
		force.findElementByName("user[email]").sendKeys("sureshprsnll@gmail.com");
		
		// Enter Company
		
		
		force.findElementByName("user[company]").sendKeys("eGovernments Foundation");
		
		// Select Country
		
		
		Select country = new Select(force.findElementById("country"));
		
		country.selectByValue("IN");
		
		// Postal Code
		
		force.findElementById("postal_code").sendKeys("613006");
		
		// User Name
		
		force.findElementById("username").sendKeys("suresh.n@egovernments.org");
		
		//force.findElementByTagName("<a href='//www.salesforce.com/company/agreements/developer_edition/' target='_blank'>Master Subscription Agreement</a>").click();
			
		//force.findElementByLinkText("I have read and agreed to the Master Subscription Agreement").click();
	
		//Clicking on Check Box
		
		force.findElementById("eula").click();
		
		// Submit Button
		
		force.findElementById("submit_btn").click();
				
		System.out.println(force.getTitle());
		
		
	}
}
