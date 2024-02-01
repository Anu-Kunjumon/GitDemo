package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offersPage {
	public WebDriver driver;
	
	public offersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By search = By.xpath("//input[@id='search-field']");
	private By prodname= By.xpath("//tr/td[text()='Tomato']");
	

	public void searchitem(String shortname)
	{
		driver.findElement(search).sendKeys(shortname);
	    
	    
	}
	public void getsearchtext()
	{
		driver.findElement(search).getText();   
	}
	public String getproductname()
	{
		return driver.findElement(prodname).getText();   
	}

}
