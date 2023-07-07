package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACME_Assignment3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		
		//login into the application
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//Get title of the page
		System.out.println(driver.getTitle());
		
		//Click Logout 
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		driver.close();
	}
}
