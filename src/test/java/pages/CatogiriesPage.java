package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatogiriesPage {
	
	WebDriver driver;
		public CatogiriesPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(id="SearchCategoryName")
		WebElement searchCatogiry;
		@FindBy(id="search-categories")
		 WebElement searchtn;
		
		public void operation(String catName) {
			searchCatogiry.sendKeys(catName);
			searchtn.click();
		}
}
