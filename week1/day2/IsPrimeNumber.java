package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int n=16;
		boolean result=true;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				result=false;
				break;
			}
		}
		if(result){
				System.out.println("Given input "+n+" is a prime number");
		}
		else {
				System.out.println("Given number "+n+" is not a prime number");
		}
	}
}
