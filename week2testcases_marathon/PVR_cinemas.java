package week2testcases_marathon;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVR_cinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//div[contains(text(),'Movie Library')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement genre = driver.findElement(By.name("genre"));
		Select selectGenre = new Select(genre);
		selectGenre.selectByVisibleText("ANIMATION");
		
		WebElement lang = driver.findElement(By.name("lang"));
		Select selectLang = new Select(lang);
		selectLang.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Paw Patrol')]")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		WebElement cinema = driver.findElement(By.id("cinemaName"));
		Select selectCinema = new Select(cinema);
		selectCinema.selectByValue("PVR Velachery Chennai");
		
		WebElement showTime = driver.findElement(By.name("timings"));
		Select selectshowTime = new Select(showTime);
		selectshowTime.selectByValue("09:00 AM - 12:00 PM");
		
		//div[@class='datepicker-container datepicker-default']
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		
		driver.findElement(By.xpath("//span[text()='12']")).click();
		
		
		driver.findElement(By.name("name")).sendKeys("Revathy");
		driver.findElement(By.name("mobile")).sendKeys("9123456780");
		
		driver.findElement(By.name("noOfTickets")).sendKeys("3");
		driver.findElement(By.name("email")).sendKeys("rev123@gmail.com");
	
		WebElement food = driver.findElement(By.name("food"));
		Select selectFood= new Select(food);
		selectFood.selectByValue("No");
		
		driver.findElement(By.name("comment")).sendKeys("Nil");
		
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
