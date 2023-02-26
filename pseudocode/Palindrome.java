package pseudocode;

public class Palindrome {
public static void main(String[] args) {
		
		//Declare a string
		String name="madam";
		//declare a empty string 'rev'
	    String rev=" ";
	  //Convert string into toCharArray
		char[] charArray=name.toCharArray();
		//iterate the values in for loop
		for(int i=charArray.length-1;i>=0;i--) {
			//store the value in rev
			rev=rev+charArray[i];
			//print the rev
			System.out.println(rev);
		}		
		//compare the strings using '.equals' method
		if(name.equals(rev)) {
			//print the result
			System.out.println("The given String is Palindrom");
		}else
		{
			System.out.println("The given String is not a Palindrom");
		}
    } 

}
