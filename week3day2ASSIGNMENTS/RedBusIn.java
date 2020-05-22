package week3day2ASSIGNMENTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusIn {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//input[@id='src']").sendKeys("Chennai");
		driver.findElementByXPath("//input[@id='src']").sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		driver.findElementByXPath("//input[@id='dest']").sendKeys("Trichy");
		driver.findElementByXPath("//input[@id='dest']").sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//div[@class='rb-calendar']//td[@class='current day'])").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//label[text()='Return Date']").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div[@id='rb-calendar_return_cal']//tbody/tr[1]/td[3]/button").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div[@id='rb-calendar_return_cal']//following::tr[5]/td[6]").click();
		Thread.sleep(3000);
		
			
		
		//driver.findElementByXPath("//div[@class='rb-calendar']").click();
		//Thread.sleep(2000);
		
		driver.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]//td[3][1]").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]//tr[2]/th[5]").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]//tr[5]/td[3]").click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='fl button']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
