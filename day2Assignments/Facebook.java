package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//clicking Create New Account button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Revathy");
		driver.findElement(By.name("lastname")).sendKeys("rev");
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9361221212");
	    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Revathy");
	    
	    WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
	    Select selectDay = new Select(day);
	    selectDay.selectByValue("5");
	    
	    WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
	    Select selectMonth = new Select(month);
	    selectMonth.selectByIndex(5);
	    
	    WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
	    Select selectYear = new Select(year);
	    selectYear.selectByVisibleText("2001");
	    
	    driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	    driver.close();
	    
		
		
		
		
	}

}
