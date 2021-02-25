package com.seleniumfundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement SignIn = driver.findElement(By.xpath("//div[@class='header_user_info']"));
		SignIn.click();

		Thread.sleep(2000);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("raahulteejay95@gmail.com");

		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.name("passwd"));
		Password.sendKeys("kumarraahul");

		Thread.sleep(2000);
		WebElement Signin = driver.findElement(By.name("SubmitLogin"));
		Signin.click();

		Thread.sleep(2000);
		WebElement Women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));

		Actions ac = new Actions(driver);
		ac.moveToElement(Women).perform();

		Thread.sleep(2000);
		WebElement Tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		ac.moveToElement(Tshirts).perform();
		Tshirts.click();

		Thread.sleep(2000);
		WebElement Faded = driver.findElement(By.xpath(
				"//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']"));
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(Faded).perform();

		Thread.sleep(2000);
		WebElement More = driver.findElement(By.xpath("//a[@class='button lnk_view btn btn-default']"));
		More.click();

		Thread.sleep(2000);
		WebElement Quantity = driver
				.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		Quantity.click();

		Thread.sleep(2000);
		WebElement Size = driver.findElement(By.id("group_1"));
		Select si = new Select(Size);
		si.selectByVisibleText("M");

		Thread.sleep(2000);
		WebElement Color = driver.findElement(By.id("color_14"));
		Color.click();

		Thread.sleep(2000);
		WebElement AddToCart = driver.findElement(By.name("Submit"));
		AddToCart.click();

		Thread.sleep(2000);
		WebElement CheckOut = driver
				.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=order'])[3]"));
		CheckOut.click();

		Thread.sleep(2000);
		WebElement Proceed = driver
				.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		Proceed.click();

		Thread.sleep(2000);
		WebElement AdditionalMsg = driver.findElement(By.name("message"));
		AdditionalMsg.sendKeys("Be more careful and cautious about the order");

		Thread.sleep(2000);
		WebElement ProceedToCheckout = driver.findElement(By.name("processAddress"));
		ProceedToCheckout.click();

		WebElement Terms = driver.findElement(By.xpath("//label[@for='cgv']"));
		Terms.click();

		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.visibilityOf(Terms));

		WebElement Proceed4 = driver.findElement(By.name("processCarrier"));
		Proceed4.click();

		Thread.sleep(2000);
		WebElement Payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		Payment.click();

		Thread.sleep(2000);
		WebElement Confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Confirm.click();
	}
}
