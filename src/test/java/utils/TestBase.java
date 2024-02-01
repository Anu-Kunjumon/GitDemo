package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String QAurl=prop.getProperty("QAurl");
		if(driver==null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:/Program Files/Selenium/chromedriver-win64/chromedriver-win64/chromedriver.exe");
				driver=new ChromeDriver();
			}
			if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				//code for firefox
			}
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get(QAurl);
		}
		return driver;
		
	}

}
