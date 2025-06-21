package week2.day1;

public class Browser {

	public void launchBrowser() {
		System.out.println("Browser launched successfully");
	}
	
	public String loadUrl() {
		
		String message = "Url is loading";
		return message;
		
	}
	
	public static void main(String[] args) {
			
		Browser browserMessage = new Browser();
		browserMessage. launchBrowser();
		String returnMessage= browserMessage.loadUrl();
		System.out.println(returnMessage);
		
		
	}

}
