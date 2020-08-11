package videocourse;

import java.util.Scanner;

public class SelectionSortALgo {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int l = sc.nextInt();
		
		int[] a = new int[l];
		
		for(int i=0 ; i<l ;i++) {
			a[i] = sc.nextInt();			
		}
		
		for(int j=0 ; j<l-1 ;j++) {
			int minIndex =j;
			for(int i=j ; i<l ; i++) {
				if(a[i] < a[minIndex]) {
					minIndex=i;
				}
			}
			int temp = a[minIndex];
			a[minIndex] = a[j];
			a[j] = temp;	
		}
		for(int item:a) {
			System.out.print(item + " ");
		}
		sc.close();
	}
		
}
  


