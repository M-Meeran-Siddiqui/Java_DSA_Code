import java.util.HashMap;
import java.util.Map;

public class C_A23 {
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        //Initialize a HashMap to store prefix sums
        Map<Integer , Integer> prefixSumMap = new HashMap<>();
        int count = 0 , prefixSum = 0 ; 
        
        //Initialize to handle cases where subarray starts from index 0 
        prefixSumMap.put(0 , 1);
        for(int i = 0 ; i<n ; i++){
              //Treat 0 and -1 to calculate balanced prefix sums
              prefixSum += (arr[i] == 0) ? -1 : 1;
              
              //Check if prefixSum already exists in map
              
              if(prefixSumMap.containsKey(prefixSum)){
                     count += prefixSumMap.get(prefixSum);
              }
              
              //Update prefixSum frequency in map
              prefixSumMap.put(prefixSum , prefixSumMap.getOrDefault(prefixSum , 0)+1);
        }
        return count;
    }


   public static void main(String[] args) {
    int arr[] = {1, 0, 0, 1, 0, 1 , 1};
    int n = arr.length;
    System.out.println(countSubarrWithEqualZeroAndOne(arr, n));
   }
}
