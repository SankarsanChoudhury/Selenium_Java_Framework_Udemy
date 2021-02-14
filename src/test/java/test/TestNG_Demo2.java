package test;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {
	
	WebDriver driver=null;

	@BeforeTest
	public void setUpTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanka\\eclipse-workspace\\Selenium_Java_Framework\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	
	@Test
	public void GoogleSearch2() {
		
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Sankarsan");
		
		WebElement element = driver.findElement(By.xpath("//div[2]/div[1]/div[3]/center/input[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}
		
		
		@Test
		public void GoogleSearch3() {
			
			
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("Sankarsan");
			
			WebElement element = driver.findElement(By.xpath("//div[2]/div[1]/div[3]/center/input[1]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().perform();
		
	
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
			}
	@AfterTest
	public void tesrDownTest() {
		
		driver.close();
		
		System.out.println("Test Completed Successfully");

		
	}

	
}
