
import java.util.Arrays;

public class SortArraySolution {

	public boolean containsDuplicate(int[] arr) {
		
		if(arr == null || arr.length == 0) { return false; }
		
		Arrays.sort(arr);		// array is first sorted 
		
		for(int i = 0; i < arr.length -1; ++i) {
			
			if(arr[i] == arr[i + 1] ) { 	// check each element with its neighbor
				return true;				// duplicate found
			}
			
		}
		
		return false;						// no duplicate found in array
		
	}
	
}
