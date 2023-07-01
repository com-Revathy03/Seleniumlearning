package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("E");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rev");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("I am a QA Engineer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revathy123@gmail.com");

		WebElement state= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selstate= new Select(state);
		selstate.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("this is testleaf page");
	    driver.findElement(By.name("submitButton")).click();
	    
	    String title= driver.getTitle();
	    System.out.println(title);

	}

}
