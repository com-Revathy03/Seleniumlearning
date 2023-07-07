package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Revathy");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys(" India");
		WebElement display = driver.findElement(By.xpath("//input[@disabled='disabled']"));
		System.out.println(display.isDisplayed());
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		WebElement retrieve = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		System.out.println(retrieve.getText());
		
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("I am Revathy from chennai");
		

	}

}
