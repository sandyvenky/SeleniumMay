package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplication1 {

	public static void main(String[] args) throws InterruptedException {
             
	// 1. TO LAUNCH GOOGLE CHROME BROWSER APPLICATION THROUGH CODE
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	// 2.  CREATING OBJECT FOR THE CLASS CHROME DRIVER
		
		ChromeDriver driver = new ChromeDriver();
		
	//3. GET THE URL OF THE WEB PAGE TO BE AUTOMATED
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	//4. TO MAXIMIXE THE WEB PAGE
		driver.manage().window().maximize();
		
	//5. TO CLOSE THE WEB PAGE
		
		//Thread.sleep(5000);
		//driver.close();
// LOG IN TO THE APPLICATION. id locator most preferable one
		
	 WebElement Username = 	driver.findElementById("username"); // Label Field
	 Username.sendKeys("demosalesmanager"); // Text field
	 driver.findElementById("password").sendKeys("crmsfa");
	 driver.findElementByClassName("decorativeSubmit").click();
	 
	 driver.findElementByLinkText("CRM/SFA").click();// <a tag means hyperlink
	 
	 driver.findElementByLinkText("Leads").click();
	 driver.findElementByLinkText("Create Lead").click();
	 
	 // WebElement Companyname = driver.findElementById("Company Name");
	 driver.findElementById("createLeadForm_companyName").sendKeys("GAVS");
	
	 //WebElement Firstname = driver.findElementById("First name");
	 driver.findElementById("createLeadForm_firstName").sendKeys("Sandhya");
	 
	 //WebElement Lastname = driver.findElementById("Last name");
	 driver.findElementById("createLeadForm_lastName").sendKeys("Venkat");
	 
	 
	 WebElement source = driver.findElementById("createLeadForm_dataSourceId");
	 
	 
	 Select dropDown = new Select(source) ;
	 //dropDown.getOptions();
	 dropDown.selectByVisibleText("Employee");
	 
	 WebElement MarketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
	 driver.findElementById("createLeadForm_marketingCampaignId");
	 
	 Select dropDown1 = new Select(MarketingCampaign);
	 //dropDown1.getOptions();
	 dropDown1.selectByVisibleText("Pay Per Click Advertising");
	 
	 WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
	 driver.findElementById("createLeadForm_ownershipEnumId");
	 
	 Select dropDown2 = new Select(Ownership);
	 List<WebElement>option2 =  dropDown2.getOptions();
	 dropDown2.selectByIndex(4);
	 
	 WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
	 driver.findElementById("createLeadForm_generalCountryGeoId");
	 
	 Select dropDown3 = new Select(Country);
	 // dropDown3.getOptions();
	 dropDown3.selectByVisibleText("India");
	 
	 System.out.println(driver.getTitle());

		driver.findElementByName("submitButton").click();
	 
		
		
		
		
	}

}
