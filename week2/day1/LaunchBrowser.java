package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver browser = new ChromeDriver();
		
		//Load the url
		browser.get("https://www.facebook.com/");
		
		//Maximize the browser
		browser.manage().window().maximize();
		
		//Close the browser
		browser.close();	
		

	}

}
