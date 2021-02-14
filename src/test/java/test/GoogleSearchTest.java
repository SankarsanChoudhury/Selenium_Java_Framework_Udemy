package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver=null;

	public static void main(String args[]) {

		GoogleSearch();

	}
	
	

	public static void GoogleSearch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanka\\eclipse-workspace\\Selenium_Java_Framework\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//Go to google
		driver.get("http://www.google.com");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter "Sankarsan" in text box
		//driver.findElement(By.name("q")).sendKeys("Sankarsan");
		
		GoogleSearchPage.textBox_Search(driver).sendKeys("Automation Step By Step");;

		//Code to click on Search button
		WebElement element = driver.findElement(By.xpath("//div[2]/div[1]/div[3]/center/input[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		driver.close();
		System.out.println("Test Completed Successfully");



	}
}



