 package topicQuestions.Searching;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
//		int arr1[] = {1,2,3,4};
//		int arr2[] = {5,7,8,9,15,18,25,35,45};
		int arr1[] = {10,20,30,40};
		int arr2[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(median(arr1 , arr2));
		System.out.println(median2(arr1 , arr2));  //if even then return floor of average of median

	}
	
	static double median(int arr1[] , int arr2[]) {    // MySolution O(n1+n2) time  & O(n1+n2) space
		int p1 = 0;
		int p2 = 0;
		int k = arr1.length + arr2.length;
		int arrNew[] = new int[k];
		for(int i=0 ; i<k ;i++) {
			if(p1>=arr1.length) {
				arrNew[i] = arr2[p2];
				p2++;
			}
			else if(p2>=arr2.length) {
				arrNew[i] = arr1[p1];
				p1++;
			}
			
			else if(arr1[p1] < arr2[p2]) {
				arrNew[i] = arr1[p1];
				p1++;
			}
			else if (arr1[p1] > arr2[p2]){
				arrNew[i] = arr2[p2];
				p2++;
			}
			
		}
	
		
		if(k%2==0) return (double)(arrNew[k/2] + arrNew[k/2 - 1]) / 2;
		else return arrNew[k/2];
			
	}
	
	static double median2(int arr[] , int brr[]) {       //Best Solution O(log(n1)) time & O(1) space
		int n = arr.length;
		int m = brr.length;
		
		if(n>m) {
		        int temp[] = arr;
		        arr = brr;
		        brr = temp;
		        int temp2 = n;
		        n=m;
		        m=temp2;
		    }
		    
		    int low = 0;
		    int high = n;
		    while(low<=high) {
		        int p1 = (low+high) / 2;
		        int p2 = (n+m+1)/2 - p1;
		        int min1 = p1==0?Integer.MIN_VALUE : arr[p1-1];
		        int max1 = p1==n?Integer.MAX_VALUE : arr[p1];
		        int min2 = p2==0?Integer.MIN_VALUE : brr[p2-1];
		        int max2 = p2==m?Integer.MAX_VALUE : brr[p2];
		        if(min1<=max2 && min2<=max1) {
		            if( (n+m)%2 == 0) return ( Math.max(min1,min2) + Math.min(max1,max2) ) / 2;
		            else return Math.max(min1,min2);
		        }
		        if(min1>max2) high = p1 - 1;
		        else low = p1 + 1;
		    }
		    return -1;
		
	}
	
}
