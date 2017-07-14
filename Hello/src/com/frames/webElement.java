package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\patta\\Desktop\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]")).click();
        String URL= driver.getCurrentUrl();
       String title= driver.getTitle();
       System.out.println("Title is" +' ' +title);
       String actualURL = driver.getCurrentUrl();
       if (actualURL.equals(URL))
       { 
    	   
    	   System.out.println("Verfied page title success"+ ' ' +actualURL);
    	          }
       else
       {
    	    System.out.println("Invalid Page title");
       }
       //capture user name
       WebElement userName = driver.findElement(By.id("ap_email"));
       userName.sendKeys("pattar75@gmail.com");
       
       //capture password
       WebElement password= driver.findElement((By.id("ap_password")));
       password.sendKeys("kishore");
       
       WebElement details = driver.findElement(By.linkText("Details"));
       details.click();
       
       //click sinin
       WebElement signin = driver.findElement(By.id("signInSubmit"));
       signin.submit();
       		
       		
	}
	
	}

