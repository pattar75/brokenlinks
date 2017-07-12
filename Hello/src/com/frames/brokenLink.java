package com.frames;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class brokenLink {
	
	
	 private static void verifyLinkActive(String linkurl)
	  {
		  
		  try
		  {
			  
			  URL url = new URL(linkurl);
			  HttpURLConnection httpurlConnect = (HttpURLConnection)url.openConnection();
			  httpurlConnect.setConnectTimeout(3000);
			  httpurlConnect.connect();
			  if (httpurlConnect.getResponseCode()==200)
			  {
				  System.out.println(linkurl+" -"+httpurlConnect.getResponseMessage());
			  }
			  
			  if (httpurlConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			  
			  {
				  System.out.println(linkurl+" -"+httpurlConnect.getResponseMessage()+ "-"+HttpURLConnection.HTTP_NOT_FOUND);
			  }
			  
		  } catch (Exception E)
		  {
			  
		  }
	  }
	
		public static void main(String[] args) throws InterruptedException {
			
			//ChromeOptions options = new ChromeOptions();
	        //options.addArguments("window-size=1600,1500");
	 
	        //DesiredCapabilities cap = DesiredCapabilities.chrome();
	        //cap.setCapability(ChromeOptions.CAPABILITY, options);
	        
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\patta\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			  //Launch URL
			  driver.get("http://google.com");
			  driver.manage().window().maximize();
			  //driver.wait(30);
			  List<WebElement> links = driver.findElements(By.tagName("a"));
			  System.out.println("Total Links are"+links.size());
			  for (int i=0;i<links.size();i++)
			  {
				  WebElement ele = links.get(i);
				  String url =ele.getAttribute("href");
				  verifyLinkActive(url);
			  }
		}
			  
}		 



	
