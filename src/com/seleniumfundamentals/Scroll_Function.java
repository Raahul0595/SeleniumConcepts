package com.seleniumfundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Function {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.danielwellington.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement RSG = driver.findElement(By.xpath("(//span[@class='css-uil62c'])[41]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", RSG);

		Thread.sleep(2000);
		WebElement Explore = driver
				.findElement(By.xpath("(//span[@class='TileOverlay__Button-sc-1tf7r0-4 foznDR css-1dcivjr'])[1]"));
		js.executeScript("arguments[0].scrollIntoView()", Explore);

	}
}
