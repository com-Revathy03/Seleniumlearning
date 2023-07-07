package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException  {
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

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Revathy");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Revathy']")).click();
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("The Page title is: "+driver.getTitle());
		}
		else {
			System.out.println("The page title doesnot contain View Lead" + driver.getTitle());
			
		}
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Blackstraw");
		
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		WebElement getCompanyName = driver.findElement(By.xpath("//span[contains(text(),'Blackstraw')]"));
		if(getCompanyName.getText().contains("Blackstraw")) {
			System.out.println("The updated company name appear");
		}
		else
		{ System.out.println("The company name is not updated");
			
		}
		
	}
}
