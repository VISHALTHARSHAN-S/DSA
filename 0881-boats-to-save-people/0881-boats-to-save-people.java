class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0;
        int r=people.length-1;
        int l=0;
        while(l<=r)
        {
            boats++;
            if(people[l]+people[r]<=limit)
             l++;
            r--;
        }

        return boats;
        
    }
}