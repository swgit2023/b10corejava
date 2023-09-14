package com.selenium.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	static WebDriver driver;
	

 public void closeBrowser() {
	 driver.quit(); 
 }
  public static void selectBrowser(String browsername) {
	  //switch case:
	  if(browsername.equals("chrome")) {
		  driver = new ChromeDriver();
		  
	  }else if(browsername.equals("firefox")) {
		  driver = new FirefoxDriver();
	  }
  }
	  
  }