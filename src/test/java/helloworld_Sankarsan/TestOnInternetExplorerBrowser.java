package helloworld_Sankarsan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestOnInternetExplorerBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String projectPath=System.getProperty("user.dir");
		//System.out.println("ProjectPath: "+projectPath);
		
		
		//System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\IEDriver\\IEDriverServer.exe");
		//No need to write the above line when we set the path of IEDriverServer.exe in Path environment variable.
		//If you set anything inside Path variablethen you can directly run it using command prompt.
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.selenium.dev");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();

	}
	

}
