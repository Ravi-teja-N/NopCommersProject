package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage {
	WebDriver driver;
		public CustomersPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		@FindBy(id="SearchEmail")
		WebElement searchMail;
		@FindBy(id="SearchLastActivityTo")
		WebElement searchDate;
		@FindBy(id="search-customers")
		WebElement searchbtn;
		public void searchMailId() {
			searchMail.sendKeys("kiyjcycyhjc676008@gmail.com");
			searchDate.sendKeys("11/24/2023");
			searchbtn.click();
		}
		
		
}
