package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		ChromeOptions option =new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver newLead =new ChromeDriver(option);
						
		//Load the url
		newLead.get("http://leaftaps.com/opentaps/");
				
		//Maximize the browser
		newLead.manage().window().maximize();
						
		//Find the username element
		newLead.findElement(By.id("username")).sendKeys("Demosalesmanager");
						
		//Find the password element
		newLead.findElement(By.id("password")).sendKeys("crmsfa");
				
		//Find the login button
		newLead.findElement(By.className("decorativeSubmit")).click();
				
		newLead.findElement(By.linkText("CRM/SFA")).click();
		
		newLead.findElement(By.linkText("Leads")).click();
		
		newLead.findElement(By.linkText("Create Lead")).click();
		
		newLead.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		newLead.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiruthika");
		
		newLead.findElement(By.id("createLeadForm_lastName")).sendKeys("Panneer");
		
		newLead.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Engineer");
		
		newLead.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(5000);
		
		newLead.close();
		
		
		
	}

}
