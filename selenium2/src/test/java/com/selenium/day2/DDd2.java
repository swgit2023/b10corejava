package com.selenium.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DDd2 extends Base {
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Test
	public void testBrowser() throws InterruptedException {
		selectBrowser("chrome");
		driver.get(url);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		Thread.sleep(3000);
		LoginPage lp = new LoginPage();
		lp.Login("sasi", "sasi123");

		driver.close();

		System.out.println("print page title : " + pageTitle);
		// closeBrowser();

	}

}
