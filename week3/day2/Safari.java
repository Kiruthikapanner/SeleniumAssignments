package week3.day2;

public class Safari extends Browser {
	
	public void  readerMode() {
		System.out.println("Its in reader mode");
	}
	
	public void fullScreenMode() {
		System.out.println("Its in full screen mode");
	}

	public static void main(String[] args) {
		Safari safariOptions = new Safari();
		safariOptions.openURL();
		safariOptions.navigateBack();
		safariOptions.readerMode();
		safariOptions.fullScreenMode();
		safariOptions.closeBrowser();
	}

}
