package week4assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaitsText {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.findElementByXPath("(//img[@alt='tooltip'])[2]").click();
		
		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement change = driver.findElementByXPath("//div//button[@id='btn']");
		
		wait.until(ExpectedConditions.textToBe(By.id("btn"), "Click Me!"));
		
		
		
		driver.findElementById("btn").click();
		
		
	}

}
