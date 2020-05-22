package week3day2ASSIGNMENTS;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) 
	{
           System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
           ChromeDriver driver = new ChromeDriver();
           driver.get("https://www.cleartrip.com/");
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
           driver.findElementByXPath("//input[@id='RoundTrip']").click();
           
          driver.findElementByXPath("//input[@id='FromTag']").sendKeys("Chennai");
          driver.findElementByXPath("//input[@id='FromTag']").sendKeys(Keys.TAB);
          
         driver.findElementByXPath("//input[@id='ToTag']").sendKeys("New York");  
         driver.findElementByXPath("//input[@id='ToTag']").sendKeys(Keys.TAB);
         
         driver.findElementByXPath("//input[@id='DepartDate']").click();
         
         
         driver.findElementByXPath("//a[contains(@class,'ui-state-default ui-state-highlight')]").click();
                    
         driver.findElementByXPath("//input[@id='ReturnDate']").click();
         driver.findElementByXPath("(//a[@title='Next'])[2]").click();
         
         driver.findElementByXPath("(//table[@class='calendar'])[2]//tr[2]/td[3]/a").click();
            
        driver.findElementByXPath("//select[@id='Adults']//option[2]").click();
         driver.findElementByXPath("//select[@id='Childrens']/option[2]").click();
         driver.findElementByXPath("//select[@id='Infants']/option[2]").click();
         driver.findElementByXPath("//a[@id='MoreOptionsLink']").click();
         
         driver.findElementByXPath("//select[@id='Class']/option[4]").click();
         driver.findElementByXPath("//input[@id='AirlineAutocomplete']").sendKeys("EMIRATES");
         driver.findElementByXPath("//input[@id='AirlineAutocomplete']").sendKeys(Keys.TAB);
         driver.findElementByXPath("//input[@id='SearchBtn']").click();
      
           
        
           
           
           
           
           
           
           
           //driver.close();
	}

}
