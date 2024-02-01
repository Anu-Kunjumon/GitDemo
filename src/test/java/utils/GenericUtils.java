package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void switchWindowToChild() throws InterruptedException
	{
		Set<String> wh=driver.getWindowHandles();
		Thread.sleep(3000);
		Iterator<String> i=wh.iterator();
		String parent=i.next();
		String child=i.next();
		driver.switchTo().window(child);
	}

}
