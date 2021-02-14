package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite //1
	public void setUp() {
		System.out.println("@BeforeSuite---Setup System property for chrome.");
	}
	
	@BeforeTest //2
	public void login() {
		System.out.println("@BeforeTest---Launch the Browser");
			
	}
	
	@BeforeClass //3
	public void launchBrowser() {
		System.out.println("@BeforeClass---Login to Application.");
		
	}
	
	/*
	 * @BeforeMethod
	 * @Test-1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test-2
	 * @AfterMethod
	 */
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("@BeforeMethod---Enter URL");
	}
	@Test //5
	public void googleTitleTest() {
		System.out.println("@Test---Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test---Search Test");
	}
	@AfterMethod //6
	public void logOut() {
		System.out.println("@AfterMethod---Logout from App.");
		
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("@AfterClass---Close browser.");
	}
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("@AfterTest ---Delete all cookies");
	}	
	
	
	
	@AfterSuite //9
	public void generateTestReport() {
		System.out.println("@AfterSuite---Generate Test report.");
	}

}
