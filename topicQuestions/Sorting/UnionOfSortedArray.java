package topicQuestions.Sorting;

public class UnionOfSortedArray {

	public static void main(String[] args) {
		int a[] = {1 , 1 , 3 ,3 , 3 };
		int b[] = {1 ,1 , 1 , 1 ,3 , 5 , 5};
		union(a,b);

	}
	
	public static void union(int a[] , int b[]) {
		int p1 = 0;
		int p2 = 0;
		
		while(p1<a.length && p2<b.length) {
			if(p1>0 && a[p1-1]==a[p1]) {
				p1++;
				continue;
			}if(p2>0 && b[p2-1]==b[p2]) {
				p2++;
				continue;
			}
			
			if(a[p1]==b[p2]) {
				System.out.print(a[p1] + " ");
				p1++;
				p2++;
			}
			else if(a[p1] < b[p2]) {
				System.out.print(a[p1] + " ");
				p1++;
			}
			else {
				System.out.println(a[p2] + " ");
				p2++;
			}
		}
		
		while(p1<a.length) {
			if(p1==0 || a[p1-1]!=a[p1]) System.out.print(a[p1] + " ");
			p1++;
		}
		while(p2<b.length) {
			if(p2==0 || b[p2-1]!=b[p2])System.out.print(b[p2] + " ");
			p2++;
		}
	}
}
