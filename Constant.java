package org.magnitia.selenium.gcreddy.batno44.constants;

import org.magnitia.selenium.gcreddy.batno44.Utilities.Utility;

public class Constant {
	
	public static final String TestData_excel_path = System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelData\\inputData.xlsx";
	
	public static final String locaters_path = System.getProperty("user.dir")+"\\src\\test\\resources\\Repositories\\Locator.properties";
	
	public static final String config_path = System.getProperty("user.dir")+"\\src\\test\\resources\\Repositories\\Config.properties";
	
	public static final String chromepath = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
	
	public static final String log4jpath = System.getProperty("user.dir")+"\\Log4j.xml";
	
	public static final String ReportsPath = System.getProperty("user.dir")+"\\ExtentReports\\"+Utility.getDate()+"\\"+Utility.getDatetime()+".html";
}

