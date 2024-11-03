package org.magnitia.selenium.gcreddy.batno44.reportCaller;

import java.io.IOException;

import org.magnitia.selenium.gcreddy.batno44.Reports.Log;
import org.magnitia.selenium.gcreddy.batno44.Reports.Reports;
import org.magnitia.selenium.gcreddy.batno44.Utilities.ExcelUtils;
import org.testng.annotations.Test;

public class ExcelCaller {
  @Test
  public void ExcelCallerTC() throws IOException {
	  //start
	  Log.startTESTABC("Excel Invocation");
	  Reports.startTEST("Excel Invocation","Provided excel is invoking and reading the data ");
	  
	  ExcelUtils.invokeExcel("C:\\Users\\Lucky\\eclipse-workspace\\org.magnitia.selenium.gcreddy.batno44\\intputData.xlsx");
	  ExcelUtils.readData("Sita");
	  
	  //end
	  Log.endTest();
	  Reports.endTest();
	  Reports.flush();	  
	 
	  
  }
}
