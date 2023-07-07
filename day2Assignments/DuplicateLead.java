package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		//clicking on Email tab
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("revathy123@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Clicking on First Resulting lead
		WebElement captureName = driver.findElement(By.xpath("//a[text()='Revathy']"));
		System.out.println(captureName.getText());
		
		driver.findElement(By.xpath("//a[text()='Revathy']")).click();
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		if(driver.getTitle().contains("Duplicate Lead"))
		{
			System.out.println("The Page title has Duplicate Lead");
		}else
		{
			System.out.println("The page title does not have Duplicate Lead");
		}
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		
		WebElement captureDuplicateName =driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		System.out.println(captureDuplicateName.getText());
		
	     
	    if(captureName.equals(captureDuplicateName)) {
	    	System.out.println("I Confirm the duplicated lead name is same as captured name");
	    }
	    else {
	    	System.out.println("duplicated lead name is different as captured name");
	    }
		
	}

}
