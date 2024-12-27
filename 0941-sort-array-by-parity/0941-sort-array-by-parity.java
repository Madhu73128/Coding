class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //2 pointers approach
        int p1=0,p2=nums.length-1;
        while(p1<p2)
        {
            while(p1<p2&&nums[p1]%2==0)
            p1++;
            while(p1<p2&&nums[p2]%2==1)
            p2--;
            int temp=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=temp;
        }
        return nums;


        // int left = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] % 2 == 0) {
        //         int temp = nums[left];
        //         nums[left] = nums[i];
        //         nums[i] = temp;
        //         left++;
        //     }
        // }

        // return nums;    
    }
}

// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int index =0;

//         for(int i=0;i<nums.length;i++){

//             if((nums[i]&1)==0){
//                 swap(index,i,nums);
//                 index++;
//             }
//         }
//         return nums;
//     }
    
//     void swap(int i, int j, int[] nums) {
//         if (nums[i] != nums[j]) {  // Only perform swap if the indices are different to avoid zeroing out the same number
//             nums[i] = nums[i] ^ nums[j];  // Step 1: nums[i] holds the XOR of nums[i] and nums[j]
//             nums[j] = nums[i] ^ nums[j];  // Step 2: nums[j] now holds the original value of nums[i]
//             nums[i] = nums[i] ^ nums[j];  // Step 3: nums[i] now holds the original value of nums[j]
//         }
//     }

// }

// https://www.youtube.com/watch?v=mff73Woo4Ak