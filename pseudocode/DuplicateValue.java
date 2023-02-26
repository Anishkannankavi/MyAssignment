package pseudocode;

public class DuplicateValue {
	public static void main(String[] args) {
		// declare the Array
		int[] num = {11,22,33,44,55,66,22,77,11};
		// iterate the value in for loop 
		for(int i=0;i<num.length;i++) {
			// iterate the value nested for loop
			for(int j=i+1;j<num.length;j++) {
				// check and compare the value
				if(num[i]==num[j]) {
					// print the duplicate element
					System.out.println("The duplicate value is " +num[i]);
	         }

           }
		}
	}
}
