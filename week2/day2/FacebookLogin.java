package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver browser = new ChromeDriver();
		
		//Load the url
		browser.get("https://facebook.com/");
		
		//Maximize the browser
		browser.manage().window().maximize();
		
		//Find the login element
		browser.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//Find the password element
		browser.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Find the button
		browser.findElement(By.name("login")).click();
		
		//browser.close();
		

	}

}
