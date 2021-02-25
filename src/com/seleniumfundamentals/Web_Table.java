package com.seleniumfundamentals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		System.out.println("=====ALL DATA=====");
		List<WebElement> AllData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		for (WebElement b1 : AllData) {
			System.out.println(b1.getText());
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("=====SELECTIVE DATA=====");
		List<WebElement> SelData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[7]/td[3]"));
		for (WebElement b1 : SelData) {
			System.out.println(b1.getText());
		}
	}
}
