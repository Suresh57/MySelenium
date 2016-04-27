package homework_3rd_week;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestWrapperClass extends WrapperCls {
	
	@Test
	
	public void TestClass ()
	{
		LaunchBrowser("chrome","http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		verifyText("WEB DEVELOPER SITE","WEB DEVghghghELOPER SITE");
		verifyTitle(driver.getTitle(), "jdhge3463643989");
		
		
	}


	}



