package com.seleniumfundamentals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm_Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");

		Thread.sleep(2000);
		WebElement ConfAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		ConfAlert.click();

		Thread.sleep(2000);
		WebElement ConfirmationAlert = driver.findElement(By.id("CancelTab"));
		ConfirmationAlert.click();

		Alert Confirm = driver.switchTo().alert();
		Thread.sleep(2000);

		Confirm.dismiss();
		Thread.sleep(2000);

	}
}
