package patterns;

class Pattern3 {

public static void main(String[] args) {
		//My solution
		for (int j=4 ; j>=1 ; j--) {
			for (int i=1 ; i<=j ;i++) {
				if (j==3 & i==1) System.out.print("  ");   
				if (j==2 & i==1) System.out.print("    "); 
				if (j==1 & i==1) System.out.print("      ");
				System.out.print("* ");
			}System.out.println();
		}
		
		//exact solution
		for (int i=1 ; i<=4 ; i++) {
			for (int j=1 ; j<=i-1 ; j++) {//we can use j variable as its scope is ended
				System.out.print("  ");
			}
			for (int j=4 ; j>=i ; j--) { // we can use j variable as its scope is ended
				System.out.print("* ");  // this for loop is outside the previous for loop
			}System.out.println();
		}
	}

}


//* * * *
//  * * *
//    * *
//      *