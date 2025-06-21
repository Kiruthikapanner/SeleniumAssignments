package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		String testArray[] = test.split(" ");
		
		for(int i=0; i<testArray.length; i++) {
			if (i % 2 != 0) {
				char[] charArray = testArray[i].toCharArray();
				String reversed="";
				for(int j=charArray.length - 1; j>=0; j-- ) {
					reversed += charArray[j];
				}
			testArray[i]=reversed;
			}
		}
		System.out.println("Reverce Odd Word Output: ");
		for(int i=0; i<testArray.length; i++) {
			
			System.out.print(testArray[i]+" ");
		}
		System.out.println("\nEven Position Words are: ");
		for(int i=0; i<testArray.length; i++) {
			if(i%2!=0) {
				System.out.print(testArray[i]+" ");
			}
		}
	}

}
