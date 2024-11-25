class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
       int n=arr.length;
       int totalsum=0;
       for(int i=0;i<n;i++)
       {
            totalsum+=arr[i];
       }
       if(totalsum%3!=0)
       {
            return false;
       }
       int targetsum=totalsum/3;
       int currsum=0;
       int cnt=0;
       for(int i=0;i<n;i++)
       {
            currsum+=arr[i];
            if(currsum==targetsum)
            {
                cnt++;
                currsum=0;
            }
            if(cnt==3)
            return true;
        }
        return false;
    }
}