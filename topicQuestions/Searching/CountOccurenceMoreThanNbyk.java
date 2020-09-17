package topicQuestions.Searching;

import java.util.Scanner;

public class CountOccurenceMoreThanNbyk {
	static class elementCount{
		public int element = 0;
		public int count = 0;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(occurence(arr , n ,k));
		sc.close();
	}
	
	
	public static int occurence(int arr[] , int n , int k) {
		
		
		if(k<2) return 0;
		elementCount temp[] = new elementCount[k-1];
		for(int i=0 ; i<k-1 ;i++) {
			temp[i] = new elementCount();
		}
		for(int i=0 ; i<n ; i++) {
			 int j;
			for(j=0 ; j<k-1 ;j++) {
				if(temp[j].element == arr[i]) {
					temp[j].count++;
					break;
				}
			}	
			if(j==k-1) {
				int l;
				for(l=0 ; l<k-1 ; l++) {
					if(temp[l].count==0) {
						temp[l].element=arr[i];
						temp[l].count=1;
						break;
					}
				}
				if(l==k-1)   for(l=0 ; l<k-1 ;l++)   temp[l].count--;
			}
			
			for(int ig=0 ; ig<k-1 ;ig++) {
				System.out.println(temp[ig].element + " " + temp[ig].count);
			}
			System.out.println();
		}
	
		int numbers = 0;
		for(int i=0 ; i<k-1 ;i++) {
			int count = 0;
			for(int j=0 ; j<n ; j++) {
				if(arr[j]==temp[i].element) count++;
				if(count>n/k) {
					numbers++;
					break;
				}
			}
		} 
		return numbers;
		
	}
}
