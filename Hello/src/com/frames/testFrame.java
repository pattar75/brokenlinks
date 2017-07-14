package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testFrame {

	public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver","C:\\Users\\patta\\Desktop\\Selenium\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("http://demoqa.com/frames-and-windows/");
driver.findElement(By.xpath(".//*[@id='ui-id-1']")).click();
driver.findElement(By.xpath(".//*[@id='ui-id-2']")).click();
driver.findElement(By.xpath(".//*[@id='ui-id-3']")).click();

	}

}
