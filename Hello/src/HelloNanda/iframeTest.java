package HelloNanda;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class iframeTest {
	//WebDriver driver;
	
	
public static void main (String[] args)
{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\patta\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
					
		driver.get("http://toolsqa.com/automation-practice-form/");
		String title= driver.getTitle();
		System.out.println("Title of page is" +title);
		String URL= driver.getCurrentUrl();
		System.out.println("URL is " +URL);
		String actualURL = driver.getCurrentUrl();
		if (actualURL.equals(URL))
		{
			
		 System.out.println("Verification successfull");
		}
		
		else
		{
			System.out.println("Verification failed");
			
		}
				int length= driver.getTitle().length();
		System.out.println("Length of Title"+length);
		
		//Storing page source
		String pagesource = driver.getPageSource();
		//Storing page length
		int pagelength = pagesource.length();
		//print length of page source in console
		System.out.println("Total length of page source" +' ' +pagelength);
		driver.close();
			
				
}
}


