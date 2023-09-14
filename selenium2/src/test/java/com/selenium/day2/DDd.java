package com.selenium.day2;

import org.testng.annotations.Test;

public class DDd extends Base {
	
	String url = "https://www.facebook.com/";
	private String pageTitle;
	
	@Test
	public void testBrowser() {
		selectBrowser("chrome");
		driver.get(url);
		driver.manage().window().maximize();
		String pagetTitle = driver.getTitle();
		
		
		
		
		
		System.out.println("print page title :" + pageTitle);
		closeBrowser();
	}

}
