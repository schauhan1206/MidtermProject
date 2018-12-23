package projectsunday;

public class FindLowestDifference {
	static int findMinDiff(int[] arr, int n) 
    { 
		int diff = Integer.MAX_VALUE; 
		for (int i=0; i<n-1; i++) 
            for (int j=i+1; j<n; j++) 
            	if (Math.abs((arr[i] - arr[j]) )< diff) 
                    diff = Math.abs((arr[i] - arr[j])); 
        return diff; 

    }

	public static void main(String[] args) {
        int arr[] = new int[]{30,12,5,9,2,20,33,1}; 
        System.out.println("Minimum difference is "+findMinDiff(arr, arr.length)); 



		
		
		
	}

}
