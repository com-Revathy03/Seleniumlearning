package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
    public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://leaftaps.com/opentaps/control/login");
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
    	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
    	driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Revathy");
        driver.findElement(By.id("lastNameField")).sendKeys("Rev");
        driver.findElement(By.name("firstNameLocal")).sendKeys("Revathy");
        driver.findElement(By.name("lastNameLocal")).sendKeys("Rev");
        driver.findElement(By.name("departmentName")).sendKeys("Testing");
        driver.findElement(By.name("description")).sendKeys("QA Engineer");
        driver.findElement(By.name("primaryEmail")).sendKeys("revathy123@gmail.com");
        WebElement state =driver.findElement(By.name("generalStateProvinceGeoId"));
        Select selectState = new Select(state);
        selectState.selectByVisibleText("New York");
        
        driver.findElement(By.name("submitButton")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("importantNote")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        String title= driver.getTitle();
        System.out.println(title);	
}
}