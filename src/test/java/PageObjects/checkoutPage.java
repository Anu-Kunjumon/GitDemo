package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {
	public WebDriver driver;
	public checkoutPage(WebDriver driver)
	{
	this.driver=driver;
	}
	private By cartbag=By.xpath("//img [@src='https://rahulshettyacademy.com/seleniumPractise/images/bag.png']");
	
	private By checkoutbtn=By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	private By promobtn=By.xpath("//button[@class='promoBtn']");
	private By placeorder=By.xpath("//button[text()='Place Order']");
	private By itemextracted=By.xpath("//p[text()='Cauliflower - 1 Kg']");
	

	public void checkoutitems() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(cartbag).click();
		Thread.sleep(3000);
		driver.findElement(checkoutbtn).click();
		Thread.sleep(3000);
	}
	
	public boolean verifyPromoBtn()
	{
		return driver.findElement(promobtn).isDisplayed();  
	}
	public boolean verifyPlaceOrder()
	{
		return driver.findElement(placeorder).isDisplayed();
	}
	public String verifyitemname()
	{
		String itemname= driver.findElement(itemextracted).getText().split("-")[0].trim();
		return itemname;
	}
}
