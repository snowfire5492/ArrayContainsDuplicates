
import java.util.Map;
import java.util.HashMap;

public class ImprovedSolutionHashMap {

	public boolean containsDuplicate(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			return false;
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(arr[0], null);
		
		for(int i = 1; i < arr.length; ++i) {
			
			if(map.containsKey(arr[i])) {
				return true;
			}
			
			map.put(arr[i], null);
			
		}
		
		return false;
	}

}
