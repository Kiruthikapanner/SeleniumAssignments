package week3.day1;


import java.util.Arrays;


public class FindDups {

	public static void main(String[] args) {
		
		int [] num = {1, 2, 7, 7, 2, 8, 8, 10, 1};
		
		Arrays.sort(num);
		
		int n = num.length;
		
		System.out.println("Duplicate numbers are: ");
		
		for(int i=0; i<n-1; i++) {
			
			if(num[i]==num[i+1]) {
				
				System.out.println(num[i]);
			}
		}
	}

}
