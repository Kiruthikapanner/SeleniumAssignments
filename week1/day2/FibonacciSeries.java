package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		System.out.println("Fibonacci series:\n"+a+"\n"+b);
		for(int i=2; i<8; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
