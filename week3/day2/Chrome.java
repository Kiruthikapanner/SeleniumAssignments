package week3.day2;

public class Chrome extends Browser{
	
	public void  openIncognito() {
		System.out.println("Opening Incognito Tab");
	}
	
	public void clearCache() {
		System.out.println("Clearing the Cache");
	}

	public static void main(String[] args) {
		
		Chrome chromeOptions = new Chrome();
		chromeOptions.openURL();
		chromeOptions.navigateBack();
		chromeOptions.openIncognito();
		chromeOptions.clearCache();
		chromeOptions.closeBrowser();	

	}

}
