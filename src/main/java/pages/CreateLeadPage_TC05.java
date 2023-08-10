package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateLeadPage_TC05 extends BaseClass{

	public CreateLeadPage_TC05  enterCompanyName() {		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
	}

	public CreateLeadPage_TC05 enterFirstName() {		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathy");
		return this;
	}

	public CreateLeadPage_TC05 enterLastName() {		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("E");
		return this;
	}  

	public CreateLeadPage_TC05 enterPhoneNumber() {		
		driver.findElement(By.xpath("(//input[@name='primaryPhoneNumber'])[4]")).sendKeys("9361221212");
		return this;
	}

	public ViewLeadsPage_TC06 clickSubmit() {		
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage_TC06();
	}

}
