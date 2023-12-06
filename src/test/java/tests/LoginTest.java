package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DashbordPage;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage  log;
	DashbordPage dp;
	@BeforeMethod
	public void before() {
		launch();
		log= new LoginPage(driver);
		
	}
	@Test
	public void run() {
		dp=log.verify();
		String actualValue="Dashboard";
		Assert.assertEquals(dp.dashboardGetText(), actualValue);
		
	}
}
