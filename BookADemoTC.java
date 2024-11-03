package fintelConnect_OtherModule;

import org.magnitia.selenium.gcreddy.batno44.Reports.Log;
import org.magnitia.selenium.gcreddy.batno44.Reports.Reports;
import org.magnitia.selenium.gcreddy.batno44.Utilities.Utility;
import org.magnitia.selenium.gcreddy.batno44.appModule.LaunchEnv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/*Test case: 
Scenario: book a Demo_Registration Process
preConditon
Open chrome browser
open https://www.fintelconnect.com/about-us/careers/ url

Click on Book A Demo button
Drag down till First name text box displayed
Enter firstname
Enter lastname 
Enter Company url
Enter company name
Select compnay type as Agency
Select how to know as LinkedIn
Click on request your demo
getThanks message;
Thanks for getting in touch. A team member will be in touch within 1-2 business days.
validate this message...
as per the validation you should pass or fail the test case...

post constion
close the browser;  */

import org.testng.annotations.Test;

public class BookADemoTC extends Utility {

	@BeforeMethod
	public static void pre_Condition() {
		
		// Open chrome browser
		Assert.assertTrue(LaunchEnv.invokeBrowser(prop_config.getProperty("browser")));
		driver.manage().window().maximize();
		Utility.waitImplicit();
		// open https://www.fintelconnect.com/about-us/careers/ url
		Assert.assertTrue(LaunchEnv.invokeUrl(prop_config.getProperty("Url")));
	}

	@Test
	public void bookADemo() {

		try {
			Log.startTESTABC("bookADemo");
			Reports.startTEST("bookADemo", "Booking a demo in careers web site");					
			Utility.JsClick(Utility.getLocator("BookDemo_BookDemo_button_xpath"));
			Thread.sleep(1000);
		//	driver.switchTo().frame(0);
		/*	if(driver.findElement(By.id("interactive-close-button")).isDisplayed()) {
			 driver.findElement(By.id("interactive-close-button")).click();
			}*/
		//	WebElement e = Utility.getLocator("BookDemo_firstname_textbox_id");
			

		} catch (Exception e) {
			Log.info("Book a demo TC failed due to " + e.fillInStackTrace());
		//	Reports.fail("Book a Demo TC", " failed due to " + e.toString(), Utility.getfailScreenshot());
		}

	}

	@AfterMethod
	public static void post_Condition() {
		Utility.closeBrowser();
	}

}
