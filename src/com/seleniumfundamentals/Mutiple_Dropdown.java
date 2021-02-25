package com.seleniumfundamentals;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mutiple_Dropdown {
	// private static final WebDriver TakesScreenshot = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		WebElement multi = driver.findElement(By.name("States"));
		String id = driver.getWindowHandle();
		System.out.println(id);

		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);

		Select m = new Select(multi);
		boolean multiple = m.isMultiple();
		System.out.println(multiple);
		Thread.sleep(2000);
		m.selectByIndex(1);

		Thread.sleep(2000);
		m.selectByValue("New York");

		Thread.sleep(2000);
		m.selectByVisibleText("Texas");

		Thread.sleep(2000);
		System.out.println("=====Get All Selected Options=====");
		List<WebElement> all = m.getAllSelectedOptions();
		for (WebElement options : all) {
			System.out.println(options.getText());
		}

		Thread.sleep(2000);
		System.out.println("=====First Selected Option=====");
		WebElement first = m.getFirstSelectedOption();
		System.out.println(first.getText());

		Thread.sleep(2000);
		m.deselectAll();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File SRC = ts.getScreenshotAs(OutputType.FILE);
		File DES = new File("C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Screenshot\\RB.png");
		FileUtils.copyFile(SRC, DES);

//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File SRC = ts.getScreenshotAs(OutputType.FILE);
//		File DES = new File("C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Screenshot\\testRB.png");
//		FileUtils.copyFile(SRC, DES);

//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File Source = ts.getScreenshotAs(OutputType.FILE);
//		File Destination = new File("C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Screenshot\\test.png");
//		FileUtils.copyFile(Source, Destination);
	}
}
