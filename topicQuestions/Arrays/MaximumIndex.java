package topicQuestions.Arrays;

public class MaximumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,6,5,4,3,2,4};
		int n = arr.length;
		System.out.println(maxIndexDiff(arr , n));
	}

static int maxIndexDiff(int arr[], int n) { // My Solution O(1) space
        
        int max_res = 0;
        int i = 0;
        int j = n-1;
        while(i<n) {
            if(arr[i] <= arr[j]) {
                max_res = Math.max(max_res , j-i);
                i++;
                j=n-1;
            }
            else j--;
            if(i==j) {
                i++;
                j=n-1;
            }
        }
        return max_res;
    }

static int maxIndexDiff2(int arr[], int n) {   // Best Solution O(n) space
    if(n==1){
        return 0;
    }
    int RMax[] = new int[n]; 
    int LMin[] = new int[n]; 
    
    /* Construct LMin[] such that LMin[i] stores the minimum value 
        from (arr[0], arr[1], ... arr[i]) */
    LMin[0] = arr[0];
    for (int i = 1; i < n; ++i) 
        LMin[i] = Integer.min(arr[i], LMin[i - 1]);
        
    /* Construct RMax[] such that RMax[j] stores the maximum value 
        from (arr[j], arr[j+1], ..arr[n-1]) */
    RMax[n - 1] = arr[n - 1]; 
    for (int j = n - 2; j >= 0; --j)
        RMax[j] = Integer.max(arr[j], RMax[j + 1]); 
        
    /* Traverse both arrays from left to right to find optimum j - i 
        This process is similar to merge() of MergeSort */
    int i = 0, j = 0, maxDiff = -1; 
    while (j < n && i < n) { 
        if (LMin[i] <= RMax[j]) { 
            maxDiff = Integer.max(maxDiff, j - i); 
            j++; 
        } else
            i++;
    }
    return maxDiff; 
}
}
