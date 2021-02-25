package com.seleniumfundamentals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Task {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement Gmail = driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
		Actions ac = new Actions(driver);
		ac.contextClick(Gmail).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		ac.click(Gmail);
	

		// driver.manage().window().maximize();

//		WebElement BestSellers = driver.findElement(By.xpath("(//a[@tabindex='0'])[7]"));
//		Actions ac = new Actions(driver);
//		ac.contextClick(BestSellers).perform();
//
//		Thread.sleep(2000);
//		Robot b = new Robot();
//		b.keyPress(KeyEvent.VK_DOWN);
//		b.keyRelease(KeyEvent.VK_DOWN);
//
//		Thread.sleep(2000);
//		b.keyPress(KeyEvent.VK_ENTER);
//		b.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement TodayDeals = driver.findElement(By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb']"));
//		Actions ac1 = new Actions(driver);
//		ac1.contextClick(TodayDeals).perform();
//
//		Thread.sleep(2000);
//		Robot b1 = new Robot();
//		b1.keyPress(KeyEvent.VK_DOWN);
//		b1.keyRelease(KeyEvent.VK_DOWN);
//
//		Thread.sleep(2000);
//		b1.keyPress(KeyEvent.VK_ENTER);
//		b1.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement Mobiles = driver.findElement(By.xpath("(//a[@tabindex='0'])[9]"));
//		Actions ac2 = new Actions(driver);
//		ac2.contextClick(Mobiles).perform();
//
//		Thread.sleep(2000);
//		Robot b2 = new Robot();
//		b2.keyPress(KeyEvent.VK_DOWN);
//		b2.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		b2.keyPress(KeyEvent.VK_ENTER);
//		b2.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement SignIn = driver
//				.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
//		Actions ac3 = new Actions(driver);
//		ac3.contextClick(SignIn).perform();
//
//		Thread.sleep(2000);
//		Robot b3 = new Robot();
//		b3.keyPress(KeyEvent.VK_DOWN);
//		b3.keyRelease(KeyEvent.VK_DOWN);
//
//		Thread.sleep(2000);
//		b3.keyPress(KeyEvent.VK_ENTER);
//		b3.keyRelease(KeyEvent.VK_DOWN);
//
//		String ParentId = driver.getWindowHandle();
//		System.out.println(ParentId);
//		String ParentTitle = driver.switchTo().window(ParentId).getTitle();
//		System.out.println(ParentTitle);
//		Set<String> AllId = driver.getWindowHandles();
//		System.out.println(AllId);
//		for (String all : AllId) {
//			String AllTitle = driver.switchTo().window(all).getTitle();
//			System.out.println(AllTitle);
//		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		String parenttitle = driver.switchTo().window(parentId).getTitle();
		System.out.println(parenttitle);
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		for (String allid : all) {
			driver.switchTo().window(allid).getTitle();
			System.out.println(allid);
		}

	}

}
