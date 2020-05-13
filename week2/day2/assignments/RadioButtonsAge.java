package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsAge {

	public static void main(String[] args) {
          
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");

		WebElement radio1 = driver.findElementByXPath("//input[@name='age'][1]");
		
		WebElement radio2 = driver.findElementByXPath("//input[@name='age'][2]");
		
		WebElement radio3 = driver.findElementByXPath("//input[@name='age'][3]");
		
		if(!radio2.isSelected())
		{
			System.out.println("Radio button not selected");
		}
	    
		else
		{
			System.out.println("Radio button selected");
		}
	
	
	}
	

}
