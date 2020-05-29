package week4assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		
		driver.findElementById("buttonLogin").click();
		
		WebElement vendor = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(vendor).build().perform();
		
		
		driver.findElementByXPath("//li//a[text()='Search for Vendor']").click();
		driver.findElementByXPath("//input[@id='vendorName']").sendKeys("Blue Lagoon");
		driver.findElementByXPath("//button[@id='buttonSearch']").click();
		
		String Country = driver.findElementByXPath("//table[@class='table']//tr/td[5]").getText();
		
		System.out.println("The country name for the vendor Blue Laggon is:"+Country);
		
		driver.findElementByXPath("//a[text()='Log Out']").click();
		
		driver.close();
		
		
}
	
}

