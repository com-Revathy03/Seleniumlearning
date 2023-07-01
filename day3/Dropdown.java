package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("E");
		
		WebElement webdrop= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select sel = new Select(webdrop);
		sel.selectByIndex(2);
		
       WebElement webdrop1= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select sel1 = new Select(webdrop1);
		sel1.selectByValue("OWN_CCORP");
		
		
	}
}
