
public class NaiveSolution {

	
	public boolean containsDuplicate(int[] arr) {
		
		// [ 1, 2, 3, 4 ]
		
		if(arr == null || arr.length == 0) {
			return false;
		}
		
		for(int i = 0; i < arr.length - 1; ++i) {
			
			for(int j = i + 1; j < arr.length; ++j) {
				
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
