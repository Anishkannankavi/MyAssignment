package pseudocode;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		//declare scanner class
		Scanner text=new Scanner(System.in); 
		//print 'enter the value'
		System.out.println("Enter the value");
		//declare the string 
		String rev=text.nextLine();
		//convert string into character
		char[] charArray=rev.toCharArray();
		//initialize the i value
		//iterate the values
		for(int i=charArray.length-1;i>=0;i--) {
			//print charArray[i]
			System.out.println(charArray[i]);
		}
	}
}
