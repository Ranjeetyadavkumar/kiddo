package kiddopiaAutomationFramework;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


/**
 * @author Ranjeet
 * Date 18/09/2021
 *
 */


public class HandleScroll {
	
	@Test
	
	public void ScrollDown() throws InterruptedException
	{
		
		System.setProperty("wedriver.gecko.driver", "./exefile/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://kiddopia.com/");
		
		//Mazimize current window
		driver.manage().window().maximize();
		
	
		
		// to perform scroll down on application using selenium
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4500)");
		
		//Delay execution for 5 seconds to view the maximize operation
		Thread.sleep(5000);
		

		// to perform scroll up on application using selenium
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,-4500)");
		
		//Delay execution for 5 seconds to view the maximize operation
		Thread.sleep(5000);
		
		
		
	}
}

