package topicQuestions.Sorting;

public class KthSmallestElement {

	public static void main(String[] args) {
		int arr[] = {3,5,4,2,9};
		System.out.println(kthSmallest(arr , arr.length , 3));

	}
	public static int kthSmallest(int arr[], int n, int k){
       
        int l = 0;
        int r = n-1;
        
        while(l<=r) {
            int p = PartitionOfTheArray.lomutoPartition(arr , l , r );
            if(p==k-1) return arr[p];
            else if(p < k-1) l = p + 1;
            else r = p - 1;
        }
        
        return -1;
    }
	
}
