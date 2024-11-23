class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(func(red,blue),func(blue,red));
    }
    public static int func(int a,int b)
    {
        int rowcnt=0;
        boolean colorchange=true;//denoting 'a' comes first(true) then followed by 'b'(false)//can also use xor for int
        int removingballs=1;
        while(a>0||b>0)
        {
            if(colorchange)
            {
                if(a>=removingballs)
                {
                    a-=removingballs;
                }
                else
                {
                    break;
                }
            }
            else
            {
                if(b>=removingballs)
                {
                    b-=removingballs;
                }
                else
                {
                    break;
                }
            }
            rowcnt++;
            colorchange=colorchange==false?true:false;
            removingballs++;
        }
        return rowcnt;
    }
}