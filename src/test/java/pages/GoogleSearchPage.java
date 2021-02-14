package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class GoogleSearchPage {
	
	private static WebElement element=null;
	
	public static WebElement textBox_Search(WebDriver driver) {
		element=driver.findElement(By.name("q"));
		return element;
	}
	
	
	public static WebElement button_Search(WebDriver driver) {
		element=driver.findElement(By.xpath("//div[2]/div[1]/div[3]/center/input[1]"));
		return element;
		
	}

}
