class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int qLen=queries.length;
        int res[]=new int[qLen];

        for(int i=0;i<qLen;i++) 
        {
            int k=queries[i][0];
            int trim=queries[i][1];

            // Create a list of pairs: (trimmedNumber, originalIndex)
            List<String[]> trimmedNums=new ArrayList<>();
            for(int j=0;j<nums.length;j++) 
            {
                String trimmed=nums[j].substring(nums[j].length()-trim);
                trimmedNums.add(new String[]{trimmed,String.valueOf(j)});
            }

            // Sort the trimmed numbers lexicographically and by index
            trimmedNums.sort((a,b)->{
                int cmp=a[0].compareTo(b[0]);
                if(cmp==0) 
                {
                    return Integer.parseInt(a[1])-Integer.parseInt(b[1]);
                }
                return cmp;
            });

            // Find the k-th smallest (1-based index)
            res[i]=Integer.parseInt(trimmedNums.get(k-1)[1]);
        }

        return res;
    }
}
// chat GPT