package topicQuestions.Sorting;
import java.util.Arrays;
public class MaximumGuests {

	public static void main(String[] args) {
		int ari[] = {900 , 600 , 700};
		int dep[] = {1000 , 800 , 730};
		System.out.println(maxGuests(ari , dep));
	}
	
	public static int maxGuests(int ari[] , int dep[]) {
		Arrays.sort(ari);
		Arrays.sort(dep);
		
		int res = 1;
		int count = 1;
		int p1 = 1;
		int p2 = 0;
		while(p1<ari.length && p2<ari.length) {
			if(ari[p1] <= dep[p2]) {
				count++;
				p1++;
			}
			else {
				count--;
				p2++;
			}
			res = Math.max(res , count);
		}
		return res;
	}
}
