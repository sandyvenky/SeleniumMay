package week4assignments;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;








public class LearnWaits {

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		driver.findElementByXPath("//img[@alt='disapper']").click();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement disappear = driver.findElementByXPath("//div//button[@id='btn']//b[1]");
		
		
		wait.until(ExpectedConditions.invisibilityOf(disappear));
		
		System.out.println(driver.findElementByTagName("strong").getText());
		
		
		
		
		
	
		
		
		
		

		
		
	}

	
		
		
		
	}


