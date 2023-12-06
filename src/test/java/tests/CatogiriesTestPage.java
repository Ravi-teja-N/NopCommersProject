package tests;

import org.apache.tools.ant.launch.Launcher;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CatogiriesPage;
import pages.CatologPage;
import pages.DashbordPage;
import pages.LoginPage;

public class CatogiriesTestPage extends BaseClass {
		LoginPage lp;
		DashbordPage dp;
		CatogiriesPage cgp;
		CatologPage cp;
		@BeforeMethod
		public void catogiriesTest() {
			launch();
			lp= new LoginPage(driver);
			dp=new DashbordPage(driver);
			cp= new CatologPage(driver);
			cgp= new  CatogiriesPage(driver);
		}
		@Test
		public void catogiriesRun() {
			dp=lp.verify();
			dp.clickCatlog();
			dp.clickProducts();
			//cp.productaction("Build your own computer");
			dp.clickCatogires();
			cgp.operation("Computers");
			String expected="Computers";
			
		}
}
