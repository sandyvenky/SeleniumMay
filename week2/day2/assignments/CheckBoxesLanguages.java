package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesLanguages {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		WebElement check1 = driver.findElementByXPath("(//input[@type='checkbox'])[1]");
		check1.click();
		if(check1.isSelected())
				{
			System.out.println("Java checkbox is selected");
		}
		else
		{
			System.out.println("Java checkbox is not selected");
		}
		WebElement check2 = driver.findElementByXPath("(//input[@type='checkbox'])[2]");
		//check2.click();
		if(check2.isSelected()) 
		{
		System.out.println("VB checkbox is selected");	
			
		}
		else
		{
			System.out.println("VB checkbox is not selected");
		}
		
		WebElement check3 = driver.findElementByXPath("(//input[@type='checkbox'])[3]");
	    check3.click();
	    if(check3.isSelected()) {
	    	System.out.println("SQL checkbox is selected");
	    		    }
	    else
	    {
	    	System.out.println("SQL checkbox is not selected");
	    }
		
		WebElement check4 = driver.findElementByXPath("(//input[@type='checkbox'])[4]");
		check4.click();
		if(check4.isSelected())
		{
			System.out.println("C CHECKBOX is selected");
		}
		else
		{
			System.out.println("C CHECKBOX is not selected");
		}
		WebElement check5 = driver.findElementByXPath("(//input[@type='checkbox'])[5]");
		check5.click();
		if(check5.isSelected())
		{
		System.out.println("C++ CHECKBox is selected");	
		}
		else
		{
			System.out.println("C++ checkbox is not selected");
		}
		WebElement check6 = driver.findElementByXPath("(//input[@type='checkbox'])[6]");
		//check6.click();
		if(check6.isSelected())
		{
			System.out.println("SELENIUM is selected");
		}
		else
		{
			System.out.println("SELENIUM IS NOT SELECTED");
		}
		WebElement check7 = driver.findElementByXPath("(//input[@type='checkbox'])[7]");
		
		if(!check7.isSelected())
				{
			System.out.println("NOT SELECTED is not clicked");
				}
		else
		{
			System.out.println("NOT SELECTED IS CLICKED");
		}
	  
		WebElement check8 = driver.findElementByXPath("(//input[@type='checkbox'])[8]");
		check8.click();
		if(check8.isSelected())
		{
			System.out.println("I AM SELECTED IS CLICKED");
		}
		else
		{
			System.out.println("I AM SELECTED IS NOT CLICKED");
		}
		
		WebElement check9 = driver.findElementByXPath("(//input[@type='checkbox'])[9]");
		check9.click();
		if(check9.isSelected())
		{
			System.out.println("OPTION1 IS SELECTED");
		}
	  
		else
		{
			System.out.println("OPTION1 IS NOT SELECTED");
		}
	   
		WebElement check10 = driver.findElementByXPath("(//input[@type='checkbox'])[10]");
		check10.click();
		if(check10.isSelected())
		{
			System.out.println("OPTION2 IS SELECTED");
		}
	  
		else
		{
			System.out.println("OPTION2 IS NOT SELECTED");
		}
		WebElement check11 = driver.findElementByXPath("(//input[@type='checkbox'])[11]");
		check11.click();
		if(check11.isSelected())
		{
			System.out.println("OPTION3 IS SELECTED");
		}
	  
		else
		{
			System.out.println("OPTION3 IS NOT SELECTED");
		}
		WebElement check12 = driver.findElementByXPath("(//input[@type='checkbox'])[12]");
		check12.click();
		if(check9.isSelected())
		{
			System.out.println("OPTION4 IS SELECTED");
		}
	  
		else
		{
			System.out.println("OPTION4 IS NOT SELECTED");
		}
	   
		WebElement check13 = driver.findElementByXPath("(//input[@type='checkbox'])[13]");
		check13.click();
		if(check13.isSelected())
		{
			System.out.println("OPTION5 IS SELECTED");
		}
	  
		else
		{
			System.out.println("OPTION5 IS NOT SELECTED");
		}
	   
		
	
	}
	
	
	

	}


