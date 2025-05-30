package week1.day2;

public class FindPalindromeNumber {

	public static void main(String[] args) {
		int input=121121;
		int output=0;
		int rem=0;
		
		for(int i=121121; i>0; i=i/10) {
			rem=i%10;
			output=(output*10)+rem;
		}
		if(output==input) {
			System.out.println("Given number is Palindrome");
		}
		else {
			System.out.println("Given number is not a Palindrome");
		}
	}

}
