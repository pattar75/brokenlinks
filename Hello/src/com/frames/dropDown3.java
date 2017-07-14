package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class dropDown3 {

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
           month_dropdown.selectByIndex(1);
           Thread.sleep(3000);
           month_dropdown.selectByValue("10");
           Thread.sleep(3000);
           month_dropdown.selectByVisibleText("Aug");
           Thread.sleep(3000);
           
           WebElement month_day=driver.findElement(By.id("day"));
           Select month_days= new Select(month_day);
           month_days.selectByIndex(3);
           Thread.sleep(2000);
           month_days.selectByValue("4");
           Thread.sleep(2000);
           month_days.selectByVisibleText("3");
           
	}

}
