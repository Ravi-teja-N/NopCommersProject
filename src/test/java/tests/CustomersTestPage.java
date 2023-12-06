package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CustomersPage;
import pages.DashbordPage;
import pages.LoginPage;

public class CustomersTestPage extends BaseClass{
	LoginPage lp;
	DashbordPage dp;
	CustomersPage cp;
	@BeforeMethod
	public void Browser() {
		launch();
		lp= new LoginPage(driver);
		dp= new DashbordPage(driver);
		cp=new CustomersPage(driver);
	}
	@Test
	public void runCustomersPage() {
		dp=lp.verify();
		dp.clickCustomers();
		dp.clickCustomers1();
		cp.searchMailId();
	}
}
