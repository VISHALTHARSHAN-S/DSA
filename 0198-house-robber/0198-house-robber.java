class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int t1=nums[0];
        int t2=Math.max(t1,nums[1]);
        int t3=0;
        if(n==2) return t2;
        for(int i=2;i<n;i++)
        {
            t3=Math.max(t1+nums[i],t2);
            t1=t2;
            t2=t3;
        }
        return t3;
    }
}