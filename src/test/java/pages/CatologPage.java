package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CatologPage  {
	WebDriver driver;
	public CatologPage( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="SearchProductName")
	WebElement productName;
	@FindBy(id="search-products")
	WebElement searchBtn;
	
	public void productaction(String name) {
		productName.sendKeys(name);
		searchBtn.click();
	}
}
