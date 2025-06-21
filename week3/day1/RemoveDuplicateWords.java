package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";
		
		String textArray[] = text.split(" ");
		
		int len = textArray.length;
		
		int count=0; 
		
		System.out.println("Original String: "+ text);
		
		for(int i=0; i<len; i++) {
			
			for(int j=i+1; j<len; j++) {
				
				if(textArray[i].equalsIgnoreCase(textArray[j])) {
					textArray[j]=" ";
					count++;					
				}
			}			
		}	
		if(count>1) {
			System.out.print("After Duplicate Words Removed: ");
			for(int i=0; i<len; i++) {
				System.out.print(textArray[i]+" ");
			}
		}	

	}

}
