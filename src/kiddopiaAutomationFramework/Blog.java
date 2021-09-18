package kiddopiaAutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



/**
 * @author Ranjeet
 * Date 18/09/2021
 *
 */

public class Blog {

	@Test

	public void Scroll() throws InterruptedException {

		System.setProperty("wedriver.gecko.driver", "./exefile/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://kiddopia.com/");

		// Maximize current window
		driver.manage().window().maximize();

		// perform click operation on Blog
		WebElement blogText = driver.findElement(By.xpath(" //a[normalize-space()='Blog']"));
		blogText.click();
		System.out.println("blogText");

		// to perform scrollDown using selenium
		JavascriptExecutor js11= (JavascriptExecutor) driver;
		js11.executeScript("window.scrollBy(0,4500)");

		// delay execution for 5 seconds to view maximum operation
		Thread.sleep(3000);

		// to perform the ScrollUp operation

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,-4500)");

		// delay execution for 5 seconds to view maximum operation
		Thread.sleep(3000);

		// To perform back button browser
		driver.navigate().back();
		// Performing the quit operation to quit the browser
		driver.quit();

}
}
