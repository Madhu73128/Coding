class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while(l<r)
        {
            int currsum=numbers[l]+numbers[r];
            if(currsum>target)
            {
                r--;
            }
            else if(currsum<target)
            {
                l++;
            }
            else
            {
                return new int[]{l+1,r+1};
            }
        }
        return new int[0];
    }
}