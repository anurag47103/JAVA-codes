package practiseProblems;

import java.util.Scanner;

public class FractionalKnacksack {
    private static double getOptimalValue(double capacity,int n, double[] values, double[] weights) {
        double value = 0,max=0;
        double valuePerKG[]=new double[n];
        int p=0;
        for (int i = 0; i < n; i++) {
        	valuePerKG[i]=values[i]/weights[i];
        }
        
        
        while(capacity>0) {
        	max = 0;
	        for (int i = 0; i < n; i++) {
	        	if(valuePerKG[i]>=max) {
	        		max = valuePerKG[i];
	        		p=i;
	        	}
	        }
	       
	        if(weights[p] <= capacity) {
	        	value += valuePerKG[p]*weights[p];
	        	capacity -= weights[p];
	        	valuePerKG[p] = 0;
	        }
	        
	        else {
	        	value += valuePerKG[p] * capacity;
	        	break;
	        }
        }
        return value;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double capacity = sc.nextDouble();
        double[] values = new double[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextDouble();
            weights[i] = sc.nextDouble();
        }
        
        System.out.println(getOptimalValue(capacity,n, values, weights));
    }
}
