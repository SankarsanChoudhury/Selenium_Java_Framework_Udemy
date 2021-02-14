package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.GoogleSearchPage;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		ExtentTest test1=extent.createTest("Google Search Test");
		
		  //test1.log(Status.PASS, "This is a test to validate google search functionality.");
		//extent.flush();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanka\\eclipse-workspace\\Selenium_Java_Framework\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		test1.log(Status.INFO,"Starting the Test Case");
		driver.get("http://www.google.com");
		test1.pass("Navigated to Google.com");
		
		driver.manage().window().maximize();
		test1.pass("Maximized the Browser window.");
		
		GoogleSearchPage.textBox_Search(driver).sendKeys("Automation Step By Step");
		test1.pass("Entered text in the Google Search text box.");
		
		//Code to click on Search button
				WebElement element = driver.findElement(By.xpath("//div[2]/div[1]/div[3]/center/input[1]"));
				Actions actions = new Actions(driver);
				actions.moveToElement(element).click().perform();
				test1.fail("Clicked on the Google Search button.");
				
				driver.close();
				driver.quit();
				test1.info("Test completed successfully.");
				extent.flush();
	}

}
