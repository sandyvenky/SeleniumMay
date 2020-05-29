package week4assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException
	{
		// TO LAUNCH GOOGLE CHROME BROWSER APPLICATION THROUGH CODE
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//CREATE AN OBJECT TO DISABLE NOTIFICATIONS
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		
		//   CREATING OBJECT FOR THE CLASS CHROME DRIVER
		
		ChromeDriver driver = new ChromeDriver();
		
		// GET THE URL OF THE WEB PAGE(nykaa) TO BE AUTOMATED
		
		driver.get("https://www.nykaa.com/");
		
		// TO MAXIMIXE THE WEB PAGE
		
		driver.manage().window().maximize();
		
		// IMPLICIT WAIT FOR ALL ELEMENTS IN THE PAGE
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// MOUSEOVER ON BRANDS
		
		WebElement brands = driver.findElementByXPath("//a[text()='brands']");
		
		// ACTION CLASS FOR MOUSE OVER
		Actions builder = new Actions(driver);
		Thread.sleep(3000);
		builder.moveToElement(brands).build().perform();
		
		// MOUSEOVER ON POPULAR
		
		WebElement popular = driver.findElementByXPath("//a[text()='Popular']");
		
		//ACTIONS CLASS FOR MOUSE OVER
		
		Actions builder1 = new Actions(driver);
		Thread.sleep(3000);
		builder1.moveToElement(popular).build().perform();
		
		// CLICK LOREAL PARIS
		
		driver.findElement(By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']")).click();
		
	
				
		Set<String> firstAndSecondwindows = driver.getWindowHandles();
		
		List<String> list1 = new ArrayList<String>(firstAndSecondwindows);
		
		String firstwindow = list1.get(0);
		
		driver.switchTo().window(firstwindow).close();
		Thread.sleep(1000);
		
		// SWITCH TO SECOND WINDOW - LOREAL PARIS
		
		String secondwindow = list1.get(1);
		
		driver.switchTo().window(secondwindow); //LOREAL PARIS WINDOW
		

		// CLICK SORT BY
		driver.findElementByXPath("//div[@class='sort-btn clearfix']").click();
		
		// SELECT CUSTOMER TOP RATED
		driver.findElementByXPath("(//div[@class='control__indicator radio'])[4]").click();
		
		Thread.sleep(3000);
		
		// CLICK CATEGORY
		driver.findElementByXPath("//div[text()='Category']").click();
		
				
		//CLICK SHAMPOO
		driver.findElementByXPath("//span[text()='Shampoo (14)']").click();
		
		//CLICK THE FIRST LISTED ITEM
		
		driver.findElementByXPath("(//div[@class='col-xs-12'])[2]/div[1]/h2").click();
		
		// OPENS A NEW WINDOW
		
		Set<String> windowhandles = driver.getWindowHandles();

		List<String> list2 = new ArrayList<String>(windowhandles);

		String shampoowindow = list2.get(1);

		driver.switchTo().window(shampoowindow);

			
		
		// CLICK ADD TO BAG
		
		driver.findElementByXPath("//div[@class='clearfix combo-add-to-btn-section']").click();
		
		Thread.sleep(3000);
		
		// GO TO SHOPPING BAG
		
		driver.findElementByXPath("//div[@class='AddToBagbox']/div[1]").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div/button[@class='btn full fill no-radius proceed ']/span").click();
		
		Thread.sleep(3000);
		
		//Print the error message and Close the browser
				String popupError = driver.findElementByXPath("//div[@class='popup-error']").getText();
				System.out.println("Displayed error is:"+popupError);
				
				//Close the browser
				driver.close();
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
