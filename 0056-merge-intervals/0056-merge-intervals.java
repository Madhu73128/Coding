class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> mergedRanges=new ArrayList<>();
        int currentRange[]=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=currentRange[1])
            {
                currentRange[1]=Math.max(currentRange[1],intervals[i][1]);
            }
            else
            {
                mergedRanges.add(currentRange);
                currentRange=intervals[i];
            }
        }
        mergedRanges.add(currentRange);
        return mergedRanges.toArray(new int[mergedRanges.size()][]);
    }
}