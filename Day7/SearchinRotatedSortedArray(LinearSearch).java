import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findPosition(ArrayList<Integer> arr, int n, int k) 
    {
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == k) {
                ans = i;
            }
        }
        return ans;
    }

}
