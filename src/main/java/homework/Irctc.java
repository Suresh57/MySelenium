package homework;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

		public static void main(String[] args) throws Exception {
		
		//Launch Fire Fox
		
		FirefoxDriver driver= new FirefoxDriver();
		
		// Getting IRCTC URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		// Click Sign Up
				
		driver.findElementByXPath("//*[@id='loginFormId']/div[1]/div[4]/div/ul/li[2]/a").click();
		

		Thread.sleep(5000);

		// Enter User ID	
		driver.findElementById("userRegistrationForm:userName").sendKeys("sureshni5");
		
		// Enter PassWord
		
		driver.findElementById("userRegistrationForm:password").sendKeys("Suresh");
		
		//Confirm Password
		
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Suresh");
		
		// Select Security question
		
		Select drop=new Select(driver.findElementById("userRegistrationForm:securityQ"));
		
		// Select By Index
		
		drop.selectByIndex(1);
		
		// Enter Answer
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Dog");
		
		// First Name
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Suresh");
		
		// Middle Name
		
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Naga");
		
		// Last Name
		
		driver.findElementById("userRegistrationForm:lastName").sendKeys("rajan");
		
		// Select Gender
		
		driver.findElementById("userRegistrationForm:gender:0").click();
		
		// Select Marital Status
		
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		
		// Select DOB
		
		Select dobday = new Select(driver.findElementById("userRegistrationForm:dobDay"));
		
		dobday.selectByValue("05");
		
		Select dobmonth = new Select(driver.findElementById("userRegistrationForm:dobMonth"));
		
		dobmonth.selectByVisibleText("JUL");
		
		Select dobyear = new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));
		
		dobyear.selectByValue("1991");
		
		//Occupation
		
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Private");
		
		// Send Mail Id
		
		driver.findElementById("userRegistrationForm:email").sendKeys("sureshprsnll@gmail.com");
		
		// Mobil NO
		
		driver.findElementById("userRegistrationForm:mobile").sendKeys("87547500991");
		
		// Nationality
		
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		
		// Door no
		
		driver.findElementById("userRegistrationForm:address").sendKeys("13/2A");
		
		//Street
		
		driver.findElementById("userRegistrationForm:street").sendKeys("Rajarajan Nagar, 1st Street, N.K. Road");
		
		// Country
		
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		
		// PinCode
		
		driver.findElementById("userRegistrationForm:pincode").sendKeys("613006");
		
		
		//City/Town
		
		driver.findElementById("userRegistrationForm:cityName").sendKeys("Thanjavur");
		
		// Post Office
		
		Thread.sleep(5000);
		
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Thanjavur P&t Colony S.O");
		
		Thread.sleep(5000);
		
		// Phone
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("9962249994");

		
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		
		// Click Submit
		
		//driver.findElementById("userRegistrationForm:j_idt486").click();
		
		
	}

}
