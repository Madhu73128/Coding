class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<=2) 
        return false;
        int increase=1;
        for(int i=1;i<n;i++) 
        {    
            //if increasing change to 0 i.e if decreasing array is there or not
            if(arr[i]<arr[i-1])
            {
                if(i==1)
                { //always decreasing
                    return false; 
                }
                increase=0; 
            }
            
            if(increase==1)
            {
                if(arr[i]<=arr[i-1])
                {
                    return false;
                }
            }
            else 
            {
                if(arr[i]>=arr[i-1])
                {
                    return false;
                }
            }
            
        }
        
        if(increase==1) 
        return false; //always increasing
        return true;
    }
}
// https://www.youtube.com/watch?v=Of4DAJHeslE