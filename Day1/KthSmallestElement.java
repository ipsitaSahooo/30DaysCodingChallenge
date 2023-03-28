class Solution{
    public static int kthSmallest(int[] a, int l, int r, int k) 
    {
     PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            p.add(a[i]);
        }
        for (int i=k;i<a.length;i++)
        {
            if (a[i]<p.peek())
            {
                p.poll();
                p.add(a[i]);
            }
        }
        return p.peek();
    } 
}

