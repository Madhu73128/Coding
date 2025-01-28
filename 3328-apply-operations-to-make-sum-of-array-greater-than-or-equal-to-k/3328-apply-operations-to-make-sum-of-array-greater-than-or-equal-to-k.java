class Solution {
    public int minOperations(int k) {
        if(k==1)
        return 0;

        int res=Integer.MAX_VALUE;
        for(int a=0;a<k;a++)// a for increasing operations and takes O(k)
        {
            int curr_val=1+a;//fixed value 1 + increasing value a
            int b=(int)Math.ceil((k*1.0)/curr_val)-1; //b for duplicating operations, since we get one val from a so we subtract 1
            
            res=Math.min(res,a+b);
        }
        return res;
    }
}

// https://www.youtube.com/watch?v=_5fM6Q_qZ4U