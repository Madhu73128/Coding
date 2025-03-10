class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int res[][]=new int[k][2];

        PriorityQueue<int[]> maxHeap=new PriorityQueue<>((a,b)->sd(b)-sd(a));

        for(int point[]:points)
        {
            maxHeap.add(point);
            if(maxHeap.size()>k)
            {
                maxHeap.poll();
            }
        }

        int i=k;
        while(!maxHeap.isEmpty())
        {
            res[--i]=maxHeap.poll();
        }

        return res;
    }
    public static int sd(int point[])
    {
        return point[0]*point[0]+point[1]*point[1];
    }
}