package week3.day2;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter Your Username: ");
	}
	public void enterPassword() {
		System.out.println("Enter Your Password: ");
	}

	public static void main(String[] args) {
		
		System.out.println("Superclass\n");
		TestData TDOption = new TestData();
		TDOption.enterCredentials();
		TDOption.navigateToHomePage();
		
		System.out.println("\nSubclass extends Superclass\n");		
		LoginTestData loginOptions = new LoginTestData();
		loginOptions.enterCredentials();
		loginOptions.enterUsername();
		loginOptions.enterPassword();
		loginOptions.navigateToHomePage();
	}

}
