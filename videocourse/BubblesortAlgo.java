package videocourse;
import java.util.Scanner;
public class BubblesortAlgo {

	public static void main(String[] args) {
			//Binary sort
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of inputs");
		int l = sc.nextInt();
		
		int a[] = new int[l];  //taking input
		System.out.println("enter your inputs");
		for(int i=0; i<l ; i++) {
			a[i] = sc.nextInt();
		}
		boolean sorted = true;
		
		for(int i=0 ; i<l-1 ; i++) {
			for(int j=0 ; j<l-1-i ; j++) {
				if (a[j+1] < a[j]) {
					
					int temp = a[j+1];
					a[j+1] =a[j];
					a[j] = temp;
					
					sorted =false;
				}
			}if (sorted == true) break;
		}
		for (int item:a) {  //for each loop
			System.out.print(item + "  ");
		}
		sc.close();
	}

}
