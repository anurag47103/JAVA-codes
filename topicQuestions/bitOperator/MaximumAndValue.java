package topicQuestions.bitOperator;

public class MaximumAndValue {

	public static void main(String[] args) {

		int a[] = { 15 , 13 ,12 ,12 ,11 };
		System.out.println(maxAnd(a , a.length));
	
	}
	
	static int maxAnd(int[] a , int n) {
		int res = 0;
		for(int k=31 ; k>=0 ;k--) {
			int count =0;
			for(int i=0 ; i<n ; i++) {
				
				if( (a[i] & (1<<k)) != 0  && (res & a[i]) >= res ) count++;
			}
			
			if(count>=2) res = res | (1<<k);
		}
		return res;
	}
	

}
