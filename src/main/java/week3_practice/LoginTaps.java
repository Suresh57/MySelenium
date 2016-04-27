package week3_practice;

import org.junit.Test;

public class LoginTaps extends WrapperClass{
	
	@Test
	public void Login()
	
	{
	 LaunchBrowser("chrome","http://demo1.opentaps.org/opentaps/control/main");
	 UserName("username", "DemoSalesManager");
	 Password("password", "crmsfa");
	 Click("decorativeSubmit");
	 ClickLink("//*[@id='label']");
	 CreateContact("Create Contact");
	 SendingKeys("firstNameField", "lastNameField", "Suresh", "Nagarajan");
	 Submit("smallSubmit");
	 Logout("decorativeSubmit");
	 System.out.println(driver.getTitle());
	 WindowClose();
	 
	}

	
}
