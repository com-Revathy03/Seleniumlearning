package week2testcases_marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Abibus {

	public static void main(String[] args) {
	//	WebDriver driver = new Chromedriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://www.abhibus.com/");
	    driver.findElement(By.id("source")).sendKeys("Chennai");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	    driver.findElement(By.id("destination")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	    driver.findElement(By.id("datepicker1")).click();
	    driver.findElement(By.xpath("(//a[text()='7'])[1]")).click();
	    driver.findElement(By.xpath("//a[text()='Search']")).click();
	    //get the bus name
	    WebElement busName = driver.findElement(By.xpath("//div[@class='search-column1']/h2"));
	    System.out.println(busName.getText());
	    
	    driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();
	    WebElement seatText= driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']"));
	    System.out.println(seatText.getText());
	    
	    driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
	    
	    driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[2]")).click();
	    WebElement selectedSeat= driver.findElement(By.xpath("//span[@id='seatnos']"));
	    System.out.println(selectedSeat.getText());
	    
	    WebElement getFare = driver.findElement(By.xpath(" //span[@id='ticketfare']"));
	    System.out.println(getFare.getText());
	    
	    WebElement boarding = driver.findElement(By.id("boardingpoint_id"));
	    Select selectBoard = new Select(boarding);
	    selectBoard.selectByIndex(3);
	    
	    WebElement dropping = driver.findElement(By.id("droppingpoint_id"));
	    Select selectDrop = new Select(dropping);
	    selectDrop.selectByVisibleText("Indira Nagar-06:24");
	    
	    System.out.println(driver.getTitle());
	    
	    driver.close();
	    
	    
	    
	   

	}

}
