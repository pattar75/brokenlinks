package com.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class hiddenRadio {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1600,1500");
 
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patta\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(cap);
		  //Launch URL
		  driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		  
		  List<WebElement> hidRadio = driver.findElements(By.id("male"));
		  int count= hidRadio.size();
		  System.out.println("Total radio buttons"+count);
		  for(int i=0;i<count;i++)
		  {
			  WebElement ele = hidRadio.get(i);
			  int x= ele.getLocation().getX();
			  if(x!=0)
			  {
				  ele.click();
				  break;
			  }
			  
		  }
	}
}

			  
