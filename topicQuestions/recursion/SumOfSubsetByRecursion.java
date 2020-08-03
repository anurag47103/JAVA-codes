package topicQuestions.recursion;

public class SumOfSubsetByRecursion {

	public static void main(String[] args) {
		
		int[] arr = {10 ,5 ,2 ,3 ,6};
		int sum = 8;
		int current[] = new int[arr.length];
		System.out.println(sumOfSubset2(arr , arr.length , 8));
	}
	
	static int sumOfSubset(int[] arr , int sum , int[] current , int index) {
		int count = 0;
		if(index >= arr.length) {
			int tempSum = 0;
			for(int i=0 ; i<current.length ;i++) {
				tempSum += current[i];
			}
			
			if(tempSum==sum) count++;
			return count;
		}
		
		count += sumOfSubset(arr , sum , current , index+1 ); 
		current[index] = arr[index];
		count += sumOfSubset(arr, sum ,current ,index+1 );
		current[index] = 0;
		return count;
	}
	
	static int sumOfSubset2(int[] arr , int n , int sum) {
		if(n==0) return (sum == 0) ? 1 : 0;
		
		return sumOfSubset2(arr , n-1 , sum) + sumOfSubset2(arr , n-1 ,sum-arr[n-1]);
	}
}
