package com.seleniumfundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("Singleframe");

		WebElement Single = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame("frame1");

		WebElement tbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		tbox.sendKeys("testing");
		
		

	}

}
