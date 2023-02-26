package pseudocode;

public class CharacterOccrance {
	public static void main(String[] args) {
		//Declare the string value
		String text="Testleaf";
		//change string into character
		char[] ele=text.toCharArray();
		//initialize the count variable as 0
		int count=0;
		//iterate the character
		for(int i=0;i<ele.length;i++) {
			//check the condition if it is match,increase the count value
			if(ele[i]=='e') 
				count=count+1;
					
		}//print the count
		System.out.println("e Occurance is "+count);
		
		
	}
}
