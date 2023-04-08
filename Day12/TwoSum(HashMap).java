import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> mk = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(mk.containsKey(target-nums[i]))
            return new int[] {mk.get(target-nums[i]),i};

            mk.put(nums[i],i);
        }
        return new int[] {};
    }
}
