
public class Main {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,1};
		//result = true
		
		int[] arr2 = {1,2,3,4};
		//result = false
		
		int[] arr3 = {1};
		// result = false
		
		int[] arr4 = {};
		//result = false
		
		int[] arr5 = null;
		//result = false
		
		
		NaiveSolution naive = new NaiveSolution();
		
		ImprovedSolutionHashMap hash = new ImprovedSolutionHashMap();
		
		SortArraySolution sort = new SortArraySolution();
		
		if(sort.containsDuplicate(arr1)) {
			System.out.println("duplicate found");
		}else {
			System.out.println("no duplicates");
		}
		
		
		
	}
	
}
