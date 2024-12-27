class Solution {
    public int largestInteger(int num) {
        char ch[]=String.valueOf(num).toCharArray();
        int n=ch.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ch[j]>ch[i]&&(ch[j]-ch[i])%2==0)//checking for greater num and parity diff%2==0
                {
                    swapfunc(ch,i,j);
                }
            }
        }
        return Integer.parseInt(new String(ch));
    }
    public static void swapfunc(char ch[],int i,int j)
    {
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
}
// https://www.youtube.com/watch?v=bXZLWnF29e4