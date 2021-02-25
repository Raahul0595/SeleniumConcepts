package com.seleniumfundamentals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement Prompt = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		Prompt.click();
		
		WebElement Demonst = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		Demonst.click();
		
		Alert PA = driver.switchTo().alert();
		PA.sendKeys("Mock practice");
		Thread.sleep(2000);
		
		//PA.accept();
		PA.dismiss();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		Thread.sleep(2000);
//		WebElement Tbox = findElement;
//		Tbox.click();
//
//		Thread.sleep(2000);
//		WebElement Prompt = driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[3]"));
//		Prompt.click();
//
//		Thread.sleep(2000);
//		Alert PromptAlert = alert;
//
//		Thread.sleep(2000);
//		PromptAlert.sendKeys("Welcome to Selenium");
//
//		Thread.sleep(2000);
//		PromptAlert.accept();

	}
}
