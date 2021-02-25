package com.seleniumfundamentals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\IEDriverServer.exe");
			} else {
				System.out.println("Invalid browsername");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
		}
		return driver;
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void InputToElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void actions(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectByOption(WebElement element, String value, String Option) {
		try {
			Select s = new Select(element);
			if (Option.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (Option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			} else if (Option.equalsIgnoreCase("visibleText")) {
				s.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
