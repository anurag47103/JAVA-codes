package videocourse;
import java.util.ArrayDeque;
import java.util.Scanner;
public class SlidingWindowMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0 ; i<n ;i++ ) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		for(int item : maxSlidingWindow(nums , k)) {
			System.out.println(item + " ");
			
		}
		sc.close();
	}
		    
			
	public static int[] maxSlidingWindow(int[] nums, int k) {
        
		int ans[] = new int[nums.length -k +1];
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		int j = 0;
		
		for(int i=0 ; i<nums.length ;i++) {
			if(i==0) ad.offerFirst(i);
			
			if(ad.getFirst() <= i - k) {
				ad.removeFirst();
			}
			
			while(ad.isEmpty() == false) {
				if(nums[i] >= nums[ad.getLast()]) {
					ad.removeLast();
				}
				else {
					ad.addLast(i);
					break;
				}	
			}
			if(ad.isEmpty()) {
				ad.addLast(i);
			}
			
			if(i>=k-1) {
				ans[j] = nums[ad.getFirst()];
				j++;
			}
		}
		return ans;
		
    }		
	

}
