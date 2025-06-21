package week3.day2;

public class Edge extends Browser {
	
	public void  takeSnap() {
		System.out.println("Taking the snapshot");
	}
	
	public void clearCookies() {
		System.out.println("Clearing the cookies");
	}

	public static void main(String[] args) {
		Edge edgeOptions = new Edge();
		edgeOptions.openURL();
		edgeOptions.navigateBack();
		edgeOptions.takeSnap();
		edgeOptions.clearCookies();
		edgeOptions.closeBrowser();

	}

}
