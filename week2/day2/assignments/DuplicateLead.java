package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.findElementByXPath("(//input[@id='username'])[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("(//input[@id='password'])").sendKeys("crmsfa");
		driver.findElementByXPath("(//input[@class='decorativeSubmit'])").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//span[contains(text(),'Email')])").click();
		driver.findElementByXPath("(//input[@name='emailAddress'])").sendKeys("vsandhya.vsm@gmail.com");
		driver.findElementByXPath("(//button[contains(text(),'Find Leads')])").click();
		Thread.sleep(3000);
		driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])//a)").click();
		driver.findElementByXPath("(//a[contains(text(),'Duplicate Lead')])").click();
		
		driver.findElementByXPath("(//input[@name='submitButton'])").click();
		driver.close();
		
		
		
		//driver.findElementByXPath("((//div[@class='x-grid-27-cell-inner x-grid3-col-partyId'])//a[@class='linktext']))").click();
		//Thread.sleep(3000);
		//driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[@class='linktext']))").click();
		
		
	}

}
