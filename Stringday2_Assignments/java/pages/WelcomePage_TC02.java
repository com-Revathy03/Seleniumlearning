package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class WelcomePage_TC02 extends BaseClass {
	public WelcomePage_TC02 verifyHomepage() {
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("Login Successful");
		}else
		{
			System.out.println("Login failed");
		}

		return this;
	}
	public MyHomePage_TC03 clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage_TC03();

	}

}
