package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1600,1500");
 
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patta\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(cap);
		  //Launch URL
		  driver.get("http://facebook.com");
		  
           WebElement month_dd= driver.findElement(By.id("month"));
           Select month_dropdown = new Select(month_dd);
          WebElement selected_value=month_dropdown.getFirstSelectedOption();
          
          //should return month
          System.out.println("Before selecting value is" +selected_value.getText());
          
          //select march
          month_dropdown.selectByIndex(3);
          
          WebElement selected_value1=month_dropdown.getFirstSelectedOption();
          System.out.println("After selection value is" +selected_value1);
          
	}
	}


