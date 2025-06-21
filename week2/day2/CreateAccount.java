package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeOptions option =new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver newAccount =new ChromeDriver(option);
				
		//Load the url
		newAccount.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser
		newAccount.manage().window().maximize();
				
		//Find the username element
		newAccount.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
		//Find the password element
		newAccount.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Find the login button
		newAccount.findElement(By.className("decorativeSubmit")).click();
		
		newAccount.findElement(By.linkText("CRM/SFA")).click();
		
		newAccount.findElement(By.linkText("Accounts")).click();
		
		newAccount.findElement(By.linkText("Create Account")).click();
		
		newAccount.findElement(By.id("accountName")).sendKeys("TestingAccount");
		
		newAccount.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Step1: Find the Element
        WebElement sourceDrop = newAccount.findElement(By.name("industryEnumId"));
       
       //Step2: Create an Object Select
       Select dropdown=new Select(sourceDrop);
       
       //Select by value
       dropdown.selectByValue("IND_SOFTWARE");
      
     
       WebElement sourceDrop1 = newAccount.findElement(By.name("ownershipEnumId"));
     
       Select dropdown1=new Select(sourceDrop1);
     
       dropdown1.selectByVisibleText("S-Corporation");
       
       
       WebElement sourceDrop2 = newAccount.findElement(By.name("dataSourceId"));
       Select dropdown2=new Select(sourceDrop2);
       dropdown2.selectByValue("LEAD_EMPLOYEE");
       
       
       WebElement sourceDrop3 = newAccount.findElement(By.name("marketingCampaignId"));
       Select dropdown3=new Select(sourceDrop3);
       dropdown3.selectByIndex(6);
       
       WebElement sourceDrop4 = newAccount.findElement(By.name("generalStateProvinceGeoId"));
       Select dropdown4=new Select(sourceDrop4);
       dropdown4.selectByValue("TX");
       
       newAccount.findElement(By.className("smallSubmit")).click();
       
       
       newAccount.close();

	}

}
