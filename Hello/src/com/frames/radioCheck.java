package com.frames;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class radioCheck {

	public static void main(String[] args) {
		 //System.setProperty("webdriver.gecko.driver","C:\\Users\\patta\\Desktop\\Selenium\\geckodriver.exe");
		  //WebDriver driver = new FirefoxDriver();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1600,1500");
 
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patta\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(cap);
		  //Launch URL
		  driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		  
		  //driver.findElement(By.xpath(".//*[@id='male']")).click();
		  		  
		  
			List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
			for(int i=0;i<radio.size();i++)
			{ 
				
				WebElement local_radio= radio.get(i);
				String value = local_radio.getAttribute("value");
				System.out.println("Radio button values are" +' ' +value);
				
				if (value.equalsIgnoreCase("Java"))
				{
					local_radio.click();
					System.out.println("Java radiobutton checked");
				}
			
			 //driver.quit();
			}
	}
}
	


