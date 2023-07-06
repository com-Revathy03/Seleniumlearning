package week2testcases_marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
	    driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
	    
	    WebElement totalBags= driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
	    System.out.println(totalBags.getText());
	    
        driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']/following::span[text()='Skybags']")).click();	    
	    driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']/following::span[text()='Safari']")).click();
	    
	    //Dropdown
	    driver.findElement(By.xpath("//span[@class='a-button-inner']")).click();
	    driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	    
	    WebElement bagName= driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
	    System.out.println(bagName.getText());
	    
	    WebElement bagPrice= driver.findElement(By.xpath("//span[@class='a-price-whole']"));
	    System.out.println(bagPrice.getText());

	}

}