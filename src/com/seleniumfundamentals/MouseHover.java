package com.seleniumfundamentals;

import java.awt.Robot;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Teejay\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		
		

		/*WebElement Men = driver.findElement(By.xpath("//a[@data-group='men']"));
		Actions ac = new Actions(driver);
		ac.clickAndHold(Men).perform();
		ac.release().perform();
		ac.doubleClick(Men).perform();

		Thread.sleep(2000);
		WebElement Speakers = driver.findElement(By.xpath("(//a[@class='desktop-categoryLink'])[42]"));
		ac.moveToElement(Speakers).perform();
		Speakers.click();
*/
	}
}
