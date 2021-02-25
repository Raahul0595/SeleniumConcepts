package com.seleniumfundamentals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_Table_Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		System.out.println("=====TABLE HEADINGS=====");
		List<WebElement> TableHeadings = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		for (WebElement b1 : TableHeadings) {
			System.out.println(b1.getText());
		}
		System.out.println("=====COLUMN SIZE IS");
		System.out.println(TableHeadings.size());

		System.out.println("=====PARTICULAR DATA=====");
		List<WebElement> SelectiveData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[7]/td[2]"));
		for (WebElement b1 : SelectiveData) {
			System.out.println(b1.getText());
		}
		
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		a.sendKeys("sdfsdkfhdskjfh");

	}
}
