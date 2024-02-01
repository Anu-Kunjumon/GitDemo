package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.pageobjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String productname;
	public pageobjectManager pageobjectmanager;
	public TestBase testbase;
	public GenericUtils genericutils;
	public TestContextSetup() throws IOException
	{
		testbase = new TestBase();
		
		//create object for pageobjectManager
		pageobjectmanager =new pageobjectManager(testbase.WebDriverManager());
		
		//create object for GenericUtils
		genericutils=new GenericUtils(testbase.WebDriverManager());
		
	}
}
