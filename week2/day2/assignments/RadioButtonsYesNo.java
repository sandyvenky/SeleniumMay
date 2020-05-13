package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsYesNo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		
		WebElement radio1 = driver.findElementByXPath("//input[@id='yes'][1]");
		radio1.click();
		
		WebElement radio2 =driver.findElementByXPath("//input[@id='no']");
		//radio2.click();
		
		if(!radio1.isSelected()) 
		{
			System.out.println("Radio Button yes not selected");
		}
		
		else
		{
			System.out.println("Radio Button yes  selected");
		}
		
		if(!radio2.isSelected())
		{
			System.out.println("Radio Button no not selected");
		}
		else
		{
			System.out.println("Radio Button no selected");
		}
		
	}

}
