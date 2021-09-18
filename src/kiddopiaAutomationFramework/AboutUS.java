package kiddopiaAutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * @author Ranjeet
 * Date 18/09/2021
 *
 */

public class AboutUS {

	@Test

	public void Scroll() throws InterruptedException {

		System.setProperty("wedriver.gecko.driver", "./exefile/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://kiddopia.com/");

		// Maximize current window
		driver.manage().window().maximize();

		// Perform the click function to click on about us page
		WebElement ABTus = driver.findElement(By.xpath(
				"//ul[@class='navbar-nav ml-auto mt-2 mt-lg-0']//a[@class='nav-link'][normalize-space()='About Us']"));
		ABTus.click();

		// to perform scrollDown using selenium
		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		js9.executeScript("window.scrollBy(0,4500)");

		// delay execution for 5 seconds to view maximum operation
		Thread.sleep(3000);

		// to perform the ScrollUp operation

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-4500)");

		// delay execution for 5 seconds to view maximum operation
		Thread.sleep(3000);

		// To perform back button browser
		driver.navigate().back();
		// verify the page title using selenium command
		//Assert.assertEquals("Expected page title", driver.getTitle());

		// Closing the browser using selenium command
		driver.close();

	}
}