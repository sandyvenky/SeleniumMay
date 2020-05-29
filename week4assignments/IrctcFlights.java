package week4assignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IrctcFlights {

	public static void main(String[] args) throws InterruptedException, IOException
	{

		// TO LAUNCH GOOGLE CHROME BROWSER APPLICATION THROUGH CODE
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
		//   CREATING OBJECT FOR THE CLASS CHROME DRIVER
	   	    ChromeDriver driver = new ChromeDriver();
		    
		 // GET THE URL OF THE WEB PAGE(irctc) TO BE AUTOMATED
		    driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		    
		 // TO MAXIMIXE THE WEB PAGE
		    driver.manage().window().maximize();
		    
		 // IMPLICIT WAIT FOR ALL ELEMENTS IN THE PAGE
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    // CLICK OK FOR THE ALERT
		    
		    driver.findElementByXPath("(//div//button[@type='submit'])[1]").click();
		    Thread.sleep(3000);
		    
		    
		    		     	    
		    // CLICK ON FLIGHTS LINK
		    
		    driver.findElementByXPath("//span[@class='allcircle circleone']").click();
		    Thread.sleep(3000);
		    
		    // GET UNIQUE REFERENCE AND TITLE FOR FIRST WINDOW
		    
		    String firstwindow = driver.getWindowHandle();
		    driver.switchTo().window(firstwindow);
		    System.out.println(firstwindow);
		    String title = driver.getTitle();
		    System.out.println(title);
		    
		    // TO RETURN BOTH WINDOW REFERENCES AND ITS RETURN TYPE AS STRING
		    Set<String> firstAndFlights = driver.getWindowHandles();
		    
		    //TO GET THE SECOND WINDOW HANDLE ALONE FROM THE REST OF SET OF STRINGS CONVERT SET TO LIST
		    List<String> listHandles = new ArrayList<String>(firstAndFlights);
		    
		    //TO GET SINGLE ITEM FROM THE LIST
		    String Flights = listHandles.get(1);
		    driver.switchTo().window(Flights);
		    System.out.println(driver.getTitle());
		
		    //listHandles.addAll(firstAndFlights);
		    
		    //USE ACTIONS CLASS TO SELECT THE CHECKBOX
		    
		    WebElement id = driver.findElementById("agree");
		    
		    Actions builder = new Actions(driver);
		    Thread.sleep(3000);
		    
		    builder.click(id).build().perform();
		    
		    //CLICK CONTINUE 
		    
		    driver.findElementByXPath("(//div//button[@type='button'])[6]").click();
		    
		    Thread.sleep(3000);
		    
		    // TO TAKE SCREENSHOT OF THE PAGE
		    //DEFINE THE SOURCE OF THE PAGE TO TAKE SCREENSHOT
		    File source = driver.getScreenshotAs(OutputType.FILE);
		    
		    //DEFINE TARGET WHERE TO PASTE THE SCREENSHOT
		    File target = new File("./snaps/flights.png");
		    
		    FileUtils.copyFile(source, target);
		    
		    
		    driver.switchTo().window(firstwindow).close();
		    
	
		    
		    
		    
		   
		    
		    
		    
		    
		    
		    
			

	}

}
