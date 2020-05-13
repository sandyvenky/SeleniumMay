package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("SANDHYA");
		
		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(3000);
        driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a))").click();
        
        String title= driver.getTitle();
        System.out.println("FIND LEADS");
	    driver.findElementByXPath("(//a[contains(text(),'Edit')])").click();
	    
	    driver.findElementByXPath("(//input[@id='updateLeadForm_companyName'][1])").clear();
	    driver.findElementByXPath("(//input[@id='updateLeadForm_companyName'][1])").sendKeys("IBM");
	    driver.findElementByXPath("(//input[@name='submitButton'])").click();
	    
	    
	    driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[text()='sandhya']
		
		
     	//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)").click();
	
		
		
	}

}
