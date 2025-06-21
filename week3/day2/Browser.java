package week3.day2;

public class Browser {

	public void openURL() {
		System.out.println("URL opened");
	}
	
	public void closeBrowser() {
		System.out.println("Closing the Browser");
	}
	
	public void navigateBack() {
		System.out.println("Navigate Back");
	}
	
	public static void main(String[] args) {
		Browser browseOptions = new Browser();
		browseOptions.openURL();
		browseOptions.closeBrowser();
		browseOptions.navigateBack();
	}

}
