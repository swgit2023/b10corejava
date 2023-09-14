package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoNavigationCommands {
	
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://fb.com");
		
		driver.findElement(By.linkText("Forgotten password")).click(); 
		try {
			Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("http://google.com");
		Thread.sleep(3000);
		}	 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


}