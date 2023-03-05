package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLragest {
	public static void main(String[] args) {
		// declare the variable
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7

				 // Create a empty Set Using TreeSet
				Set<Integer>value=new TreeSet<Integer>();
				 // iterate it in for loop 
				for (int i = 0; i < data.length; i++) {
					value.add(data[i]);
					
				}
				 //converted Set into List
				List<Integer>number=new ArrayList<Integer>(value);
				 // Print the second largest number
				System.out.println(number.get(number.size()-2));

	}

}


