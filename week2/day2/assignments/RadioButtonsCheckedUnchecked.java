package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsCheckedUnchecked {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");

		WebElement radio1 = driver.findElementByXPath("//input[@name='news'][1]");
		//radio1.click();
		
		//WebElement radio2 = driver.findElementByXPath("//input[@name='news'][2]");
		//radio2.click();
		
		if(!radio1.isSelected()) 
		{
			System.out.println("Radio Button Unchecked not selected");
		}
		
		else
		{
			System.out.println("Radio Button UnChecked  selected");
		}
		
		
	
	}
	
	

}
