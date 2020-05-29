package week4assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException
	
	{
		// TO LAUNCH GOOGLE CHROME BROWSER APPLICATION THROUGH CODE
		
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				
				
				//   CREATING OBJECT FOR THE CLASS CHROME DRIVER
				
				ChromeDriver driver = new ChromeDriver();
				
				// GET THE URL OF THE WEB PAGE(service-now) TO BE AUTOMATED
				
				driver.get("https://dev60453.service-now.com/");
				
				// TO MAXIMIXE THE WEB PAGE
				
				driver.manage().window().maximize();
				
				// IMPLICIT WAIT FOR ALL ELEMENTS IN THE PAGE
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				// CODE FOR SWITCH TO FRAME SINCE THE SERVICENOW PAGE IS WITHINN THE FRAME
				
				// GET FRAME ID
				
				 driver.switchTo().frame("gsft_main");
				
				//ENTERING WITH USERNAME AND PASSWORD // LOG IN TO SERVICE NOW
				
				driver.findElementById("user_name").sendKeys("admin");
				driver.findElementById("user_password").sendKeys("India@123");
				driver.findElementById("sysverb_login").click();
				
				//ENTER CHANGE IN FILTER NAVIGATOR
				
				driver.findElementByXPath("//input[@id='filter']").sendKeys("Change",Keys.ENTER);
				Thread.sleep(3000);
				
				// SELECT BY CLICKING ALL IN THE MENU
                driver.findElementByXPath("(//div[text()='All'])[4]").click();
                Thread.sleep(3000);
                
                 // GET FRAME ID
                
                driver.switchTo().frame("gsft_main");
                
                // CLICK CREATE NEW
                driver.findElementByXPath("//button[@id='sysverb_new']").click();
                Thread.sleep(3000);
                
                // CLICK NORMAL CHANGE
				driver.findElementByXPath("//div[@class='container-fluid wizard-container']//a[1]").click();
				Thread.sleep(3000);
				
				//CAPTURE CHANGE REQUEST NUMBER FROM THE NUMBER FIELD 
				//use get attribute
				
				 String changenumber = driver.findElementByXPath("//input[@id='change_request.number']").getAttribute("value");
				 System.out.println(changenumber);
				 
				// ENTERING MANDATORY FIELDS  
				 driver.findElementByXPath("//input[@id='change_request.short_description']").sendKeys("Text Change Request");
				 
				 //CLICK SUBMIT BUTTON
				 
				 driver.findElementByXPath("//div//button[@id='sysverb_insert_bottom']").click();
				 Thread.sleep(2000);
				 
				 
				 // GO TO SEARCH FIELD AND SEARCH THE CAPTURED NUMBER
				 
				 driver.findElementByXPath("(//div//input[@id='change_request_table_header_search_control'])[1]").sendKeys("CHG0030476",Keys.ENTER);
				
				 // VERIFY THE SUCCESSFULL CREATION OF CHANGE
				 
				 boolean displayed = driver.findElementByXPath("//a[text()='"+changenumber+"']").isDisplayed();
					if (displayed) {
						System.out.println("Change Request :" + changenumber + " got created successfully");
					} else {
						System.out.println("Change Request :" + changenumber + " not created successfully");
					}
				
				
				
				
				
				
				
				
				
				
				
	}

}
