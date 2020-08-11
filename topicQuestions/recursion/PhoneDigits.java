package topicQuestions.recursion;
import java.util.ArrayList;
import java.util.Collections;


class PhoneDigits{
	
	  static ArrayList <String> possibleWords(int a[], int n) {
	        // your code here  
		  ArrayList<String> a2 = new ArrayList<>();
		  	a2.add("a");
	        a2.add("b");
	        a2.add("c");
	        ArrayList<String> a3 = new ArrayList<>();
	        a3.add("d");
	        a3.add("e");
	        a3.add("f");
	        ArrayList<String> a4 = new ArrayList<>();
	        a4.add("g");
	        a4.add("h");
	        a4.add("i");
	        ArrayList<String> a5 = new ArrayList<>();
	        a5.add("j");
	        a5.add("k");
	        a5.add("l");
	        ArrayList<String> a6 = new ArrayList<>();
	        a6.add("m");
	        a6.add("n");
	        a6.add("o");
	        ArrayList<String> a7 = new ArrayList<>();
	        a7.add("p");
	        a7.add("q");
	        a7.add("r");
	        a7.add("s");
	        ArrayList<String> a8 = new ArrayList<>();
	        a8.add("t");
	        a8.add("u");
	        a8.add("v");
	        ArrayList<String> a9 = new ArrayList<>();
	        a9.add("w");
	        a9.add("x");
	        a9.add("y");
	        a9.add("z");
	        
		    ArrayList<ArrayList<String> > aList = new ArrayList<ArrayList<String> >(n); 
		    for(int i=0 ; i<n ;i++) {
	        if(a[i]==2) aList.add(a2);
	        else if(a[i]==3) aList.add(a3);
	        else if(a[i]==4) aList.add(a4);
	        else if(a[i]==5) aList.add(a5);
	        else if(a[i]==6) aList.add(a6);
	        else if(a[i]==7) aList.add(a7);
	        else if(a[i]==8) aList.add(a8);
	        else if(a[i]==9) aList.add(a9);
		    }
	        ArrayList<String> ans = new ArrayList<String>();
	        ArrayList<String> ansFinal = new ArrayList<String>();
	        
	        ansFinal = phone(aList , n , 0 , 0 , "" , ans);
	        Collections.sort(ansFinal);
	        return ansFinal;
	    }
	  
	  static ArrayList<String> phone(ArrayList<ArrayList<String>> aList , int n , int index1 , int index2 , String current ,ArrayList<String> ans ) {
		  int j = 0;
		  if(index1==n) j = aList.get(index1-1).size();
		  else j = aList.get(index1).size();
		  for(int i=0 ; i<j ;i++) {
		 
			  if(index1>=n) {
				  ans.add(current);
				  return ans;
			  }
			  
			  phone(aList , n , index1+1 , i, current + aList.get(index1).get(i) , ans);
			 
			  
		  }
		  return ans;
	  }
	  
	  public static void main(String[] args) {
		  int a[] = {2 , 3 ,9};
		  int n = a.length;
		  System.out.println(possibleWords(a , n ));
	  }
	}
