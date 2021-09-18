package kiddopiaAutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



/**
 * @author Ranjeet
 * Date 18/09/2021
 * we can not perfrom scroll operation on this task, 
 */

public class TreeTrail {

	@Test

	public void FreeButton() {

		System.setProperty("wedriver.gecko.driver", "./exefile/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://kiddopia.com/");

		// Maximize current window
		driver.manage().window().maximize();
    // To perform click operation on free trail using selenium command
		
		WebElement FreeTRL = driver.findElement(By.xpath("//a[@id='start-trial-bttn']"));
		FreeTRL.click();
		System.out.println("FreeTRL");
		
	// To perform back button browser
		
		driver.navigate().back();
			
	// Performing the quit operation to quit the browser
			
		driver.quit();

	

}
}