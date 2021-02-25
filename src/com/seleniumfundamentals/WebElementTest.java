package com.seleniumfundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
//	Thread.sleep(2000);
	//WebElement email = driver.findElement(By.name("email"));
	//email.sendKeys("raahul@gmail.com");
	
	//Thread.sleep(2000);
	//WebElement password = driver.findElement(By.name("pass"));
	//password.sendKeys("987654");	
	
	//Thread.sleep(3000);
	//WebElement logIn = driver.findElement(By.name("login"));
	//logIn.click();
	
	Thread.sleep(2000);
	WebElement CAcnt = driver.findElement(By.id("u_0_2"));
	CAcnt.click();
	
	Thread.sleep(2000);
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByIndex(1);
	
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.id("month"));
	Select s1 = new Select(month);
	s1.selectByValue("3");
	
	Thread.sleep(2000);
	WebElement year = driver.findElement(By.id("year"));
	Select s2 = new Select(year);
	s2.selectByVisibleText("1995");
	
}
}
