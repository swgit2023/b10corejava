
package com.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTagName {

	String url = "http://www.amazon.in/";
	@Test
	public void testLinkText() {
		WebDriver driver = new ChromeDriver();
		
	
		driver.get(url);

         List<WebElement> li = driver.findElements(By.tagName("a"));
		int numberOfLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Links count :" +numberOfLinks);
		
		for(WebElement webElement : li) {
			
			String linkText = webElement.getText();
			System.out.println("link name :" + linkText);
			String  link_url = webElement.getAttribute("href");
			System.out.println("Link url :" + link_url);
		}
		
			
		}
		

}