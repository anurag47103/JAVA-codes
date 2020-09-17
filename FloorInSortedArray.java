import java.util.ArrayList;

class FloorSearch{
    
    // Function to find floor of x
    // arr: input array
    // left and right as 0 and n-1, where n is the size of array
    static int ans = -1;
    static int findFloor(long arr[], int low, int high, long x)
    {
        int mid = (low+high) / 2;
       if(low>high) return ans;
       if(arr[mid]==x) return mid;
       else if(arr[mid] < x){
           ans = mid;
           return findFloor(arr , mid + 1 , high , x) ;         
       } 
       else return findFloor(arr , low , mid - 1 , x) ; 
    }
   
}
class MinimumNumber{
    
    static long minNumber(int arr[], long low, long high) {
       return minNumber2(arr , low , high , Integer.MAX_VALUE);
    }
   
   static long minNumber2(int arr[], long low, long high , int ans)
   {
       
       // Your code here
       long mid = (low+high) / 2;
       if(low>high) return ans;
       if(arr[(int)mid] >= arr[(int)low]) {
           ans = Math.min(arr[(int)low] , ans);
           return minNumber2(arr, mid+1 , high , ans);
       }
       else {
           ans = Math.min(ans , arr[(int)mid]);
           return minNumber2(arr , low , mid - 1 , ans);
       }
   }
   
}
class Subarray{
    
    // Function to find subarray with given sum
    static ArrayList<Integer> subarraySum(int n, int sum, int[] arr) {
        
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int tempSum = 0;
        for(int i=0 ; i<n ;i++) {
            arr[i] = tempSum + arr[i];
            tempSum = arr[i];
        }
        int left = 0;
        int right = n-1;
        while(left<right) {
            if(arr[right] - arr[left] == sum) {
                ans.add(left);
                ans.add(right);
            }
            else if(arr[right] - arr[left] < sum) right--;
            else left++;
        }
        if(ans.isEmpty()) ans.add(-1);
        return ans;
    }
}