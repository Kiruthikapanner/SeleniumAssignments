package week3.day2;

public class TestData {
	
	public void enterCredentials() {
		System.out.println("Please enter your credentials:");
	}
	
	public void navigateToHomePage() {
		System.out.println("Navitage to HomePage");
	}

	public static void main(String[] args) {
		TestData testdataOptions = new TestData();
		testdataOptions.enterCredentials();
		testdataOptions.navigateToHomePage();
	}

}
