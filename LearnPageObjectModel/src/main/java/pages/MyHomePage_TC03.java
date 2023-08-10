package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyHomePage_TC03 extends BaseClass{
	
	public MyLeadsPage_TC04 clickLeadsLink() {
		 driver.findElement(By.linkText("Leads")).click();
		 return new MyLeadsPage_TC04();

	}

}
