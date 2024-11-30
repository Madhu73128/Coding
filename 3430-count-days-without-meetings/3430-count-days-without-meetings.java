import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
        int n=meetings.length;
        Arrays.sort(meetings,(a,b)->(a[0]-b[0]));
        int last=1;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int start=meetings[i][0];
            int end=meetings[i][1];
            if(start>last)
            {
                count+=(i==0)?start-last:start-last-1;
            }
            last=Math.max(last,end);
        }
        count+=days-last;
        return count;
    }
}
