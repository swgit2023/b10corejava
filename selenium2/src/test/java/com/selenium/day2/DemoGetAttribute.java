package com.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoGetAttribute {
	
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Test
	public void testLinkText() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		WebElement user_name = driver.findElement(By.name("username"));
		
		 //print placeholder value 
		
		String strl = user_name.getAttribute("rtfggfheholder");
		System.out.println(strl);


		String str2 = user_name.getAttribute("class");
		System.out.println(str2);
				
	//	driver.findElement(By.name("user_name")).sendKeys("ggjww");
	}

}
