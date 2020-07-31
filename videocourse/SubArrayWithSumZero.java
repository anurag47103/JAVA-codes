package videocourse;
import java.util.*;
public class SubArrayWithSumZero {

	public static void main(String[] args) {
			int a[] = {4 , -4 ,2 ,1 , 9};
			boolean isFound = false;
			int sum=0;
			
			Set<Integer> hs = new HashSet<>();
			for(int i=0 ; i<a.length ;i++) {
				hs.add(sum);
				sum+=a[i];
				if(hs.contains(sum)) {
					isFound = true;
					break;
				}
				
			}
			System.out.println(isFound);
	}

}
