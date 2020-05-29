package week4assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Wwindowsshandlings {

	public static void main(String[] args)
	
	{
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Window.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String firstwindow =driver.getWindowHandle();
		
		System.out.println(firstwindow);
		
		driver.findElementById("home").click();
		
Set<String> firstAndSecond = driver.getWindowHandles();
		
		List<String> listHandles = new ArrayList<String>(firstAndSecond);
		
		String secondWindow = listHandles.get(1);
		
		System.out.println(driver.getTitle());
		//listHandles.addAll(firstAndSecond);
		
		driver.switchTo().window(secondWindow);
		
		System.out.println(driver.getTitle());
		
		driver.findElementByXPath("(//img)[2]").click();
		
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().window(listHandles.get(0));
		  
		  System.out.println(driver.getTitle());
		  
		  
			  System.out.println("***********************");
			  
			  for (String eachHandle : firstAndSecond) {
			  
			  System.out.println(eachHandle);
			  
			  }
			 
			 
		
		
	}

}
