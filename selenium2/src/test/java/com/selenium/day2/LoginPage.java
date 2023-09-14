package com.selenium.day2;

import org.openqa.selenium.By;

public class LoginPage extends Base {
	
	public void Login(String uname,String pwd) {
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
	//driver findElement(By.linkText("")).click();
		
		driver.findElement(By.linkText("forgot your password")).click();
		
	}

}
