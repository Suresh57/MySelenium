package homework;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch Firefox
		
		FirefoxDriver createlead= new FirefoxDriver();
				
		// Getting URL
		createlead.get("http://demo1.opentaps.org/opentaps/control/main");
		
		Thread.sleep(500);
		
		System.out.println(createlead.getTitle());
		
		// Enter User Name
		
		createlead.findElementById("username").sendKeys("DemoSalesManager");
		
		// Enter Password
		
		createlead.findElementById("password").sendKeys("crmsfa");

		// Click Login
		//*[@id="login"]/p[3]/input
		
		createlead.findElementByXPath("//*[@id='login']/p[3]/input").click();
		
		// Click crmsfa
		
		//*[@id="button"]
		
		createlead.findElementByXPath("//*[@id='button']").click();
		
		System.out.println(createlead.getTitle());
		
		Thread.sleep(500);
		
		// Click Create Lead//*[@id="ext-gen266"]
		
		createlead.findElementByLinkText("Create Lead").click();
			
		// Company Name
		
		Thread.sleep(5000);
		
		
		createlead.findElementById("createLeadForm_companyName").sendKeys("eGovernments Foundation");
		
		// First Name
		
		createlead.findElementById("createLeadForm_firstName").sendKeys("Suresh");
		
		// Select Source
		
		Select source = new Select(createlead.findElementById("createLeadForm_dataSourceId"));
		
		source.selectByValue("LEAD_EMPLOYEE");
		
		// Last Name
		
		createlead.findElementById("createLeadForm_lastName").sendKeys("Nagarajan");
		
		// Birth Date
		
		createlead.findElementById("createLeadForm_birthDate").sendKeys("7/5/91");
		
		// Email
		
		createlead.findElementById("createLeadForm_primaryEmail").sendKeys("sureshprsnll@gmai.com");
		
		// Phone Number
		
		createlead.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8754750099");
		
		//Submit Create Lead
		
		createlead.findElementByName("submitButton").click();
		
				
	}
}