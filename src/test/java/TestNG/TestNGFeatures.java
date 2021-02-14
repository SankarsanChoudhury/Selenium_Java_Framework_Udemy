package TestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i=9/0;
	}
	
	//This test case will not be executed as it depends on loginTest. Since loginTest fails it will be skipped.
	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest() {
		System.out.println("Home Page");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("Search Page");
	}

}
