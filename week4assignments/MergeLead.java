package week4assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("(//input[@id='username'])[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("(//input[@id='password'])").sendKeys("crmsfa");
		driver.findElementByXPath("(//input[@class='decorativeSubmit'])").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//a[text()='Contacts']").click();
		
		driver.findElementByXPath("//a[text()='Merge Contacts']").click();
		
		//Get unique reference of first window
  		String firstwindow = driver.getWindowHandle();
  		
  		//SwitchTo first window
  		driver.switchTo().window(firstwindow);
  		
  		//get title 
  		String title = driver.getTitle();
  		
  		System.out.println(title);
		
		
			
		String findcontactwindow = driver.getWindowHandle();
		
		System.out.println(findcontactwindow);
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		
		Thread.sleep(3000);
		
	    Set<String> findcontactwindowAndFromcontactswindow = driver.getWindowHandles();
	    
	    List<String> listHandles = new ArrayList<String>(findcontactwindowAndFromcontactswindow);
	    
	    String Fromcontactswindow = listHandles.get(1);
	    System.out.println(driver.getTitle());
	    driver.switchTo().window(Fromcontactswindow);
	    System.out.println(driver.getTitle());
	
		driver.findElementByXPath("//div/a[text()='DemoCustomer']").click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(firstwindow);
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Thread.sleep(3000);
		
		Set<String> tocontactwindow= driver.getWindowHandles();
		
		List<String> listHandles1 = new ArrayList<String>(tocontactwindow);
		
		String tocontactwindow1 = listHandles1.get(1);
		
		driver.switchTo().window(tocontactwindow1);
		
		driver.findElementByXPath("//div/a[text()='FrenchCustomer']").click();
		
		driver.switchTo().window(firstwindow);
		
		driver.findElementByXPath("//td/a[text()='Merge']").click();
		
		driver.switchTo().alert().accept();
		
        System.out.println("driver.getTitle()");		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
