package videocourse;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		int a[][] = new int [5][3];
		
		int b[][] = {
					 {2,4,5,6,9,8},
					 {4,322,1},
					 {6,7,5,6,4,5,3,2,3}
					};
		System.out.println(b[2][6]); //3
		System.out.println(b[0][1]); //4
		//System.out.print(b[1][3]); ERROR
	}

}
