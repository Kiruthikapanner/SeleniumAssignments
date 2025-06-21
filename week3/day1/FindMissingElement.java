package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int arr[]= {1,4,3,2,8,6,7};
		
		Arrays.sort(arr);
		
		int len=arr.length; 
		
		for (int i=1; i<len; i++) {
				
				boolean result=false;
				
				for(int j=0; j<arr.length; j++) {
				
					if (arr[j]==i) {
						result=true;
						break;
					}
				}
				 // If not found, this is the missing number
	            if (result==false) {
	                System.out.println("Missing number is: " + i);
	                break;
	            }
		}
	}
}


