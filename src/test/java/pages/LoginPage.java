package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage  extends BaseClass{
	
	WebDriver driver;
	public LoginPage(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	WebElement userName;
	@FindBy(name="Password")
	WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn;
	
	public DashbordPage verify() {
		userName.clear();
		userName.sendKeys("admin@yourstore.com");
		pwd.clear();
		pwd.sendKeys("admin");
		btn.click();
		return new DashbordPage(driver);
	}

}
