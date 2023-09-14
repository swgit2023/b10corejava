
package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoLinkText {

	@Test
	public void testLinkText() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://wwww.facebook.com");
		
		driver.findElement(By.partialLinkText("forgotten pass")).click();
		 driver.findElement(By.className("inputtext")).sendKeys("hdadajquiqq");
	}
}
