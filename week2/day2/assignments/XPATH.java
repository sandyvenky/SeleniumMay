package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("(//input[@id='username'])[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		
		//driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		//driver.findElementByXPath("//img[@alt='Lookup'][1]").click();
		//driver.findElementByXPath("//img[@alt='Lookup']").click();
		
		
		
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)").click();
		
		
		//driver.findElementByLinkText("Create Lead").click();
		
		//driver.findElementByXPath("(//input[@id='createLeadForm_companyName'])[1]").sendKeys("GAVS");
		//driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Sandhya");
		//driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("venkat");
		
		
		
		//driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']//option[3]").click();
		//driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']//option[8]").click();
		//driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']/option[6]").click();
		//driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']/option[103]").click();
		
		
	   //driver.findElementByXPath("//input[@name='submitButton']").click();
		
		
		//Thread.sleep(5000);
		//driver.close();

		
		
	}

}
