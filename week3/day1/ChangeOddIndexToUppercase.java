package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		System.out.println("Original String: "+test);
		
		char[] charArray = test.toCharArray();
		
		for (int i=0; i<charArray.length; i++) {
			
			if (i % 2 != 0) {
				
				charArray[i] = Character.toUpperCase(charArray[i]);				
			}			
		}
		String result = new String(charArray);
		System.out.println("Changed String: "+result);
	}
}
