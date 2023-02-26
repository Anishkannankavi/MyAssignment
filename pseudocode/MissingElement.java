package pseudocode;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		//declare the Array
		int[] num= {2,5,6,8,9,1,3,4};
		//sort the Array
		Arrays.sort(num);
		//declare the variable n and store the Array 
		int n = num.length+1;
		
		int sum=n*(n+1)/2;
		//iterate the values in for loop
		for (int i = 0; i < num.length; i++) {
			 //sub the num[i] value with sum
			sum=sum-num[i];
			 
		}
		//print sum
		System.out.println(sum);
	}

}
