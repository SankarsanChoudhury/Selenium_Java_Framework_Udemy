package helloworld_Sankarsan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOnChromeBrowser {

	public static void main(String[] args) throws Exception {
		String projectPath=System.getProperty("user.dir");
		System.out.println("ProjectPath: "+projectPath);

		//If you give the location of folder having driver in environment variable Path, then you don't have to set.

		//System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		//driver.findElement(By.name("q")).click();
		//driver.findElement(By.xpath("//input[name='q']")).sendKeys("Selenium official website");

		List<WebElement> listOfInputBox=driver.findElements(By.xpath("//input"));
		int countOfInputBox=listOfInputBox.size();

		System.out.println("Total no of input tags present on google are: "+countOfInputBox);

		//WebElement textBox=driver.findElement(By.name("q"));
		//textBox.sendKeys("Selenium official website");

		//Enter test in search box
		driver.findElement(By.name("q")).sendKeys("Selenium official website");

		//click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		//Thread.sleep(3000);


		driver.close();

	}

}
