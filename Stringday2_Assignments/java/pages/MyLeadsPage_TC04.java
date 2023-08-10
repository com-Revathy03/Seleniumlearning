package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyLeadsPage_TC04 extends BaseClass{
	
  public CreateLeadPage_TC05 clickCreateLeadPage() {
	  driver.findElement(By.linkText("Create Lead")).click();
	  return new CreateLeadPage_TC05();

}
}
