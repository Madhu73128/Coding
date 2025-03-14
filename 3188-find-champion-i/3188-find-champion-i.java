class Solution {
    public int findChampion(int[][] grid) {
        int n=grid.length;
        int res=0,maxcnt=0;

        for(int i=0;i<n;i++)
        {
            int cnt=0;
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    cnt++;
                }
            }

            if(maxcnt<cnt)
            {
                maxcnt=cnt;
                res=i;
            }
        }
        return res;
    }
}