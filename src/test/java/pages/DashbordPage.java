package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashbordPage {
	
	WebDriver driver;
		public DashbordPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
		WebElement getTextdash;
		@FindBy(xpath="//i[@class='nav-icon fas fa-book']")
		WebElement catelog;
		@FindBy(xpath="//a[@href='/Admin/Product/List']")
		WebElement products;
		@FindBy(xpath="//a[@href='/Admin/Category/List']")
		WebElement categories;
		@FindBy(xpath="//i[@class='nav-icon far fa-user']")
		WebElement customers;
		@FindBy(xpath="//a[@href='/Admin/Customer/List']")
		WebElement customer1;
		
		public String dashboardGetText()
		{
			return getTextdash.getText();
		}
		public void clickCatlog() {
			catelog.click();
		}
		public void clickProducts() {
			 products.click();
		}
		public void clickCatogires() {
			categories.click();
		}
		public void clickCustomers() {
			customers.click();
		}
		public void clickCustomers1() {
			customer1.click();
		}
	
}
