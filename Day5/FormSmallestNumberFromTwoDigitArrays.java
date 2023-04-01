class Solution {
    public int minNumber(int[] nums1, int[] nums2) 
    {
        int n1=nums1.length;
        int n2=nums2.length;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int min3=Integer.MAX_VALUE;
        int ans=0;
        
        ArrayList<Integer> a1=new ArrayList<>();
        
        
        for(int i=0;i<n1;i++)
        {
            a1.add(nums1[i]);
            if(nums1[i]<min1)
                min1=nums1[i];
        }
        for(int i=0;i<n2;i++)
        {
            if(a1.contains(nums2[i]))
            {
                if(min2>nums2[i])
                    min2=nums2[i];
            }
            
            if(min3>nums2[i])
                min3=nums2[i];
        }
        
        if(a1.contains(min2))
            ans= min2;
        else
        {
            if(min1<min3)
                ans=(min1*10)+min3;
            else
                ans=(min3*10)+min1;
        }
        return ans;
    }
}
