package videocourse;
import java.util.Scanner;
public class BubbleSortAlgo2 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of inputs");
		int l = sc.nextInt();
		
		boolean sorted = false;
		int a[] = new int[l];
		
		System.out.println("enter the inputs");
		for(int i=0 ; i<l ; i++) {
			a[i] = sc.nextInt();
		}
		while(sorted==false) {
			sorted=true;
			for(int j=0 ; j<l-1 ; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j] = temp;
					sorted=false;
				}
			}
		}
		for(int item: a) {
			System.out.print(item + " ");
		}
		sc.close();
	}

}
