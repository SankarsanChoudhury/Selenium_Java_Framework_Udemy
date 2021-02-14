package helloworld_Sankarsan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOnFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("ProjectPath: "+projectPath);
		
		
		System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http:www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.close();

	}

}
