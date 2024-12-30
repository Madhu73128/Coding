class Solution {
    public int[] replaceElements(int[] arr)
    // {
    //     int n=arr.length;
    //     int max=arr[n-1];
    //     for(int i=n-2;i>=0;i--)
    //     {
    //         int temp=arr[i];
    //         arr[i]=max;
    //         max=Math.max(max,temp);
    //     }
    //     arr[n-1]=-1;
    //     return arr;
    // }
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {   
            arr[i]=rightMax(arr,i+1,n);
        }
        arr[n-1]=-1;
        return arr;
    }
    public static int rightMax(int arr[],int start,int end)
    {
        int max=Integer.MIN_VALUE;
        for(int i=start;i<end;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
// https://www.youtube.com/watch?v=gXk0D7A00oE