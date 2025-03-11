class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;

        int arr[]=Arrays.copyOf(nums,n);//copy original array to new array and the sort
        Arrays.sort(arr);

        int idx=n-1;//to start from the back of sorted array

        //now fill odd positions followed by even positions
        for(int i=1;i<n;i+=2)
        {
            nums[i]=arr[idx--];
        }
        for(int i=0;i<n;i+=2)
        {
            nums[i]=arr[idx--];
        }
    }
}