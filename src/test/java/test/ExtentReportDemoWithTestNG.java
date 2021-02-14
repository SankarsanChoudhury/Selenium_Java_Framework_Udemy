package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.GoogleSearchPage;

public class ExtentReportDemoWithTestNG {
	ExtentReports extent;
	WebDriver driver;
	
	
	@BeforeSuite
	public void setUp() {
		
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("extent.html");
		extent.attachReporter(spark);
		
		
	}
	
	@BeforeTest
	public void setUpTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanka\\eclipse-workspace\\Selenium_Java_Framework\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}

@Test
public void test1() {
	
	ExtentTest test1=extent.createTest("Google Search Test");
	driver.get("http://www.google.com");
	test1.log(Status.INFO,"Starting the Test Case");
	test1.pass("Navigated to Google.com");
	driver.manage().window().maximize();
	test1.pass("Maximized the Browser window.");
	test1.addScreenCaptureFromPath("SCreenshot.png");
	
	GoogleSearchPage.textBox_Search(driver).sendKeys("Automation Step By Step");
	test1.pass("Entered text in the Google Search text box.");
	
	//Code to click on Search button
	WebElement element = driver.findElement(By.xpath("//div[2]/div[1]/div[3]/center/input[1]"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().perform();
	
}

@AfterTest
public void tearDownTest() {
	driver.close();
	driver.quit();
	System.out.println("Test completed successfully.");
}


@AfterSuite
public void tearDown() {
	extent.flush();
}
}
