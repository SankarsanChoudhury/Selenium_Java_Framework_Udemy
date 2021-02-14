package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver=null;
	
	public static void main(String args[]) {
		
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanka\\eclipse-workspace\\Selenium_Java_Framework\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
		
		driver.get("http://www.google.com");
		searchPageObj.setTextInSearchBox("Automation");
		searchPageObj.clickSearchButton();
		driver.close();
		
	}

}
