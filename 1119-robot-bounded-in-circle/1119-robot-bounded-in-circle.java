class Solution {
    public boolean isRobotBounded(String instructions) {
        int x=0,y=0; //initial position
        int dx=0,dy=1;//initial direction
        for(char ch:instructions.toCharArray())
        {
            if(ch=='G')
            {
                x+=dx;
                y+=dy;
            }
            else if(ch=='L')
            {
                int temp=dx;
                dx=-dy;
                dy=temp;
            }
            else
            {
                int temp=dx;
                dx=dy;
                dy=-temp;
            }
        }
        return (x==0&&y==0)||(dx!=0&&dy!=1)||(dx==0&&dy==-1);
    }
}

// https://www.youtube.com/watch?v=nKv2LnC_g6E