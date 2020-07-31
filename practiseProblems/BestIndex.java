package practiseProblems;
import java.util.Arrays;
import java.util.Scanner;
public class BestIndex {
	
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(); 
		
		
		int num[] = new int[l];
		for(int i=0 ; i<l ; i++) {
			num[i] = sc.nextInt();
		}

		int a[] = new int[100];
		int temp =1;
		int temp2 =2;
		
		a[0]=1;
		for(int i=1 ; i<100 ; i++) {
			a[i] = temp + temp2; 
			temp=a[i];
			temp2++;
		
    }
		int lastIndex = 0;
		int sum[] = new int[l];
		
		for(int i=0 ; i<l ; i++) {
			for(int j=i ;j<=lastIndex(i,l,a) ;j++ ) {
			sum[i] += num[j];
			}
		}
		
		Arrays.sort(sum);
		System.out.println(sum[l-1]);
	}	
	static int lastIndex(int index , int numOfElements , int[] a) {
		
		int pass = numOfElements - index;
		int magicNum = 0;
		for(int i=0 ; i<100 ;i++) {
			if(a[i]>pass & a[i]!=pass) {
				magicNum = a[i-1];
				break;
			}
			
			else if(a[i]==pass) magicNum = a[i];
		}
		int lastIndex = index + magicNum -1;
		return lastIndex;
	}
			
}
	
	
	

