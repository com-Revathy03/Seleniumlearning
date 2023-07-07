package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9361221212");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//Thread.sleep(3000);
		WebElement capture = driver.findElement(By.xpath("(//a[contains(text(),'14449')])[1]"));
		System.out.println("Lead Id is: "+capture.getText());
		driver.findElement(By.xpath("(//a[contains(text(),'14449')])[1]")).click();

		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();

		driver.findElement(By.name("id")).sendKeys("14449");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
		String innerText = text.getText();
		if(innerText.contains("No records")) {
			System.out.println("No records to display in the Lead List. This message confirms the successful deletion");
		}
		else {
			System.out.println("Records present in the Lead List");
		}
		driver.close();		
	}

}
