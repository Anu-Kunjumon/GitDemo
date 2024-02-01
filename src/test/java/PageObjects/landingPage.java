package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingPage {
	public WebDriver driver;
	public landingPage(WebDriver driver)
	{
	this.driver=driver;
	}
	private By search=By.xpath("//input[@type='search']");
	private By productname=By.xpath("//h4[@class='product-name']");
	private By topdeals=By.xpath("//a[text()='Top Deals']");
	private By plussign=By.xpath("//a[@class='increment']");
	private By addtocart=By.xpath("//button[text()='ADD TO CART']");

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
		return driver.findElement(productname).getText();   
	}
	public void selecttopdeals()
	{
		driver.findElement(topdeals).click(); 
	}
	public String gettitleofpage()
	{
		return driver.getTitle();
	}
	public void incrementqty(int quantity)
	{
		for(int i=1;i<quantity;i++)
		{
			driver.findElement(plussign).click();
		}
	}
	public void addtocart()
	{		
		driver.findElement(addtocart).click();
	}
}
