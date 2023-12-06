package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CatologPage;
import pages.DashbordPage;
import pages.LoginPage;

public class CatologTestPage extends BaseClass {
	
		LoginPage lp;
		DashbordPage dp;
		CatologPage cp;
	@BeforeMethod
	public void openMethod() {
		launch();
		lp= new LoginPage(driver);
		dp=new DashbordPage(driver);
		cp= new CatologPage(driver);
	}
	@Test
	public void runMethod() {
		dp=lp.verify();
		dp.clickCatlog();
		dp.clickProducts();
		cp.productaction("Apple MacBook Pro 13-inch");
	}
}
