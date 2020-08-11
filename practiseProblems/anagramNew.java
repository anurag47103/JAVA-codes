package practiseProblems;
import java.util.Scanner;

public class anagramNew {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int j=0 ; j<t ; j++) {
		
		String a =sc.next();
		String b =sc.next();
	
		int extra = 0;
		int al[] = new int[256];
	
		for(char item: a.toCharArray()) {
			int index = (int)item;
			al[index]++;					//increasing the value in the array of index (index)
		}									//if string a contains char c then al[99]=1
		for(char item: b.toCharArray()) {
			int index = (int) item;
			al[index]--;					//decreasing when it appears in b string
		}									//if string b contains char c then al[99]=0
		for(int i=97 ; i<=122 ; i++) {
			if(al[i] != 0) {
				int n = Math.abs(al[i]);
				extra+=n;
			}
		}System.out.println(extra);
		

		}
		sc.close();
	}
}