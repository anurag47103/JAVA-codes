package topicQuestions.Sorting;

import java.util.ArrayList;

public class MergeThreeSortedArray {

	public static void main(String[] args) {
			int a[] = {1,2,3,4,5,6};
			int b[] = {10,20};
			int c[] = {100,200,300,400};
			System.out.println(merge3sorted(a,b,c));
	}
	static ArrayList<Integer> merge3sorted(int a[], int b[], int c[])
    {
        // add ypur code here
        ArrayList<Integer> ans = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int n1 = a.length;
        int n2 = b.length;
        int n3 = c.length;
        
        if(n1>n2) {
            if(n2>n3) {
                int temp[] = a.clone();
                a = c.clone();
                c = temp.clone();
            }
            else if(n3>n2) {
                int temp[] = a.clone();
                a = b.clone();
                b = temp.clone();
            }
        }
        else {
            if(n1>n3) {
                int temp[] = a.clone();
                a = c.clone();
                c = temp.clone(); 
            }
        }
        
        while(p1<a.length && p2<b.length && p3<c.length) {
            if(a[p1] >= b[p2]) {
                if(b[p2] >= c[p3]) ans.add(c[p3++]);
                else ans.add(b[p2++]);
            }
            else {
                if(a[p1] >= c[p3]) ans.add(c[p3++]);
                else ans.add(a[p1++]);
            }
        }
        if(p1>=a.length) {
            while(p2<b.length && p3<c.length) {
                if(b[p2] < c[p3]) ans.add(b[p2++]);
                else ans.add(c[p3++]);
            }
            while(p2<b.length) {
                ans.add(b[p2++]);
            }
            while(p3<c.length){
                ans.add(c[p3++]);
            }
        }
        else if(p2>=b.length) {
             while(p1<a.length && p3<c.length) {
                if(a[p1] < c[p3]) ans.add(a[p1++]);
                else ans.add(c[p3++]);
            }
            while(p1<a.length) {
                ans.add(a[p1++]);
            }
            while(p3<c.length){
                ans.add(c[p3++]);
            }
        }
        else {
             while(p2<b.length && p1<a.length) {
                if(b[p2] < a[p1]) ans.add(b[p2++]);
                else ans.add(a[p1++]);
            }
            while(p2<b.length) {
                ans.add(b[p2++]);
            }
            while(p1<a.length){
                ans.add(a[p1++]);
            }
        }
        
        return ans;
    }
}
