package pages;


import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage_TC01 extends BaseClass{

	public LoginPage_TC01 enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		return this;
	}

	public LoginPage_TC01 enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}

	public WelcomePage_TC02 clickLoginButton() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new WelcomePage_TC02();
	}


}
