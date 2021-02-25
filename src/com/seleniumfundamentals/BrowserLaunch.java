package com.seleniumfundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = getBrowser("Chrome");
		getUrl("https://www.facebook.com/");
		WebElement UserName = driver.findElement(By.name("email"));
		InputToElement(UserName, "Raahul");
		WebElement Password = driver.findElement(By.name("pass"));
		InputToElement(Password, "23456");
		WebElement Login = driver.findElement(By.name("login"));
		clickOnElement(Login);
	}
	}

