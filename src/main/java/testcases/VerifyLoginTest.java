package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage_TC01;

public class VerifyLoginTest extends BaseClass {
	
	@Test
	public void testLogin() {
		LoginPage_TC01 lp = new LoginPage_TC01();
		lp.enterUsername().enterPassword().clickLoginButton().verifyHomepage().clickCRMSFALink().clickLeadsLink()
		.clickCreateLeadPage().enterCompanyName().enterFirstName().enterLastName().enterPhoneNumber().clickSubmit()
		.verifyViewLead();
	}

}
