package org.magnitia.selenium.gcreddy.batno44.reportCaller;

import org.magnitia.selenium.gcreddy.batno44.Reports.Log;
import org.testng.annotations.Test;

public class LogCaller {
  @Test
  public void testCase1() {
	// start
	 Log.startTESTABC("Test Case 1");
	
	 Log.info("chrome Browser is opened sucessfully");
	 //end
	 Log.endTest();

	  
  }
 
  @Test
  public void testCase2() {
	  Log.startTESTABC("Test case no. 2");
	  Log.info("chrome browser is opened successfully");
	  Log.info("enter  appliction urs as https://google.com");
	  Log.fail("Application is not able to open due to some reason ");
	  Log.endTest();
  }
  
  @Test
  public void testCase3() {
	  Log.startTESTABC("Test case no. 3");
	  Log.info("chrome browser is opened successfully");
	  Log.info("enter  appliction urs as https://google.com");
	  Log.info("Application is invoked successfully");
	  Log.warn(" YOur username is expired please update your username");
	  Log.endTest();
  }
  
  @Test
  public void testCase4() {
	  Log.startTESTABC("Test case no. 4");
	  Log.info("chrome browser is opened successfully");
	  Log.info("enter  appliction urs as https://google.com");
	  Log.info("Application is invoked successfully");
	  Log.fatal("Data base is filled.");
	  Log.endTest();
  }
}
