package com.seleniumfundamentals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");

		WebElement Simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		Simple.click();

		Thread.sleep(2000);
		Alert Sim = driver.switchTo().alert();
		Sim.accept();

	}
}
