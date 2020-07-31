package patterns;

public class Pattern6 {

	public static void main(String[] args) {
		
		//My solution
		int num = 1;
		  for (int i=1 ; i<=7 ; i++) {
			  for (int j=1 ; j<=num ; j++) {
				  System.out.print("* ");
			  } if(i<=3) num++;
			  	else num--;
			  	System.out.println();
			  }
		  
		 //Exact solution 
		  int rows =7;
		  for (int i=1 ; i<=rows ; i++) {
			  if(i<=4) {
				  for (int j=1 ; j<=i ; j++)
					  System.out.print("* ");
			  }else {
				  for (int j=1 ; j<=7-i+1 ; j++)
					  System.out.print("* ");
			  }System.out.println();
		  
		  
		  }
		  }
		}  
		
	  

//*
//* *
//* * *
//* * * *
//* * *
//* *
//*
