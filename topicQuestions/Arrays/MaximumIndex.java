package topicQuestions.Arrays;

public class MaximumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,6,5,4,3,2,4};
		int n = arr.length;
		System.out.println(maxIndexDiff(arr , n));
	}

static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
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
}
