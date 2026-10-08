class Solution {
    public int totalFruit(int[] fruits) {
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int right=0,left=0;right<fruits.length;right++)
        {
            int curr=fruits[right];
            map.put(curr,map.getOrDefault(curr,0)+1);
            while(map.size()>2)
            {
                curr=fruits[left];
                map.put(curr,map.get(curr)-1);
                if(map.get(curr)==0)
                 map.remove(curr);
                left++;
            }

            max=Math.max(max,right-left+1);
        }

        return max;
    }
}