package topicQuestions.Arrays;

public class StockBuyAndSell {

	public static void main(String[] args) {
//		int a[] = {2,10,20,30};
		int a[] = {1,5,3,1,2,8};
		int n = a.length;
		System.out.println(profit3(a,n));
		
	}
	
	static int profit(int[] a , int n) {   //My Solution O(n)
		int profit = 0;
		int buy =0, sell ;
		boolean buyed = false;
		
		for(int i=0 ; i<n-1 ;i++) {
			if(a[i] < a[i+1] && buyed == false) { 
				buy = i;
				buyed = true;
			}
			else if(buyed && a[i] < a[i+1] && i==n-2) {
				sell = i+1;
				profit += a[sell] - a[buy];
			}
			else if(buyed && a[i] > a[i+1] ) {
				sell=i;
				profit += a[sell] - a[buy];
				buyed=false;
			}
			
		}
			return profit;
	}
	
	static int profit2(int[] a , int n) {  //Best Solution O(n) simliar to mine but more easy
		int profit = 0;
		for(int i=1 ; i<n ;i++) {
			if(a[i] > a[i-1]) {
				profit += a[i] - a[i-1]; 
			}
		}
		return profit;
	}
	
	static int profit3(int[] a, int n) {   //By recursion 
		return maxProfit(a,n,0,n-1);
	}
	static int maxProfit(int[] a , int n , int start , int end) {
		if(start>=end) return 0; 
		int profit = 0;
		for(int i=start ; i<end ;i++) {
			for(int j=i+1 ; j<=end ; j++) {
				if(a[j] > a[i]) {
					int currentProfit = a[j]-a[i] + maxProfit(a,n,start,i-1) + maxProfit(a,n,j+1,end);
					profit = Math.max(currentProfit , profit);
				}
			}
		
		}
		return profit;
	}
}
