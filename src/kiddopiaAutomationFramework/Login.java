package kiddopiaAutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	
	public void singin() {

		System.setProperty("wedriver.gecko.driver", "./exefile/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://kiddopia.com/");

		// Maximize current window
		driver.manage().window().maximize();
		
		// To perform the click operation for signin button 
		
		WebElement signIN = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
		signIN.click();
		
	// to perform sign in with facebook action 
		WebElement faceboo = driver.findElement(By.xpath("//span[normalize-space()='Sign in with Facebook']"));
		
		faceboo.click();
		
		// perfom login and password action with facebook login page.
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7303830763");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Ranjeet123@");
		
		// To perfrom on sign button to click to submit
		driver.findElement(By.cssSelector("#loginbutton")).click();
		
		// again perform continue button to login with facebook account
		driver.findElement(By.xpath("//button[normalize-space()='Continue as Ranjeet']")).click();
		
		// closing the browser
		driver.close();
	

}
}
