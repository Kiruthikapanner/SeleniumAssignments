package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		ChromeDriver browser = new ChromeDriver();
				
		//Load the url
		browser.get("https://en-gb.facebook.com/");
				
		//Maximize the browser
		browser.manage().window().maximize();
		
		Thread.sleep(2000);
		
		browser.findElement(By.linkText("Create new account")).click();
		
		
		browser.findElement(By.name("firstname")).sendKeys("Kiruthik");
				
	
		browser.findElement(By.name("lastname")).sendKeys("Panneer");
		
		 WebElement sourceDrop1 = browser.findElement(By.name("birthday_day"));
	     Select dropdown1=new Select(sourceDrop1);
	     dropdown1.selectByValue("9");
	     
	     WebElement sourceDrop2 = browser.findElement(By.name("birthday_month"));
	     Select dropdown2=new Select(sourceDrop2);
	     dropdown2.selectByValue("11");
	     
	     WebElement sourceDrop3 = browser.findElement(By.name("birthday_year"));
	     Select dropdown3=new Select(sourceDrop3);
	     dropdown3.selectByValue("2014");
	     

			//Find the radio button
			browser.findElement(By.cssSelector("input[name='sex'][value='2']")).click();
					
	     
		browser.findElement(By.name("reg_email__")).sendKeys("kiru@example.com");
		
		browser.findElement(By.id("password_step_input")).sendKeys("kiru@123");
		

	}

}
