class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        for(int num:nums)
        {
            if(((num&1)==0&&num%3==0)||num%6==0)//checking Even & Division cases
            {
                sum+=num;
                count++;
            }
        }
        if(count==0||sum==0)
        return 0;
        return (int)(sum/count);
    }
}
// https://www.youtube.com/watch?v=_pfUqLfU2qg