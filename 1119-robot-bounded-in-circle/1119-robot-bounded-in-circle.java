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


//     public boolean isRobotBounded(String instructions) {
//         int angle = 0;
//         int x = 0;
//         int y = 0;
//         for(char c: instructions.toCharArray())
//         {
//             if(c=='R')
//                 angle = (angle-90+360)%360;
//             else if(c=='L')
//                 angle = (angle+90)%360;
//             else
//             {
//                 System.out.println(angle);
//                 switch (angle){
//                     case 0:
//                     {   
//                         x++;
//                         break;
//                     }
//                     case 90:
//                     {    y--;
//                         break;
//                     }
//                     case 180:
//                     {    x--;
//                         break;
//                     }
//                     case 270:
//                     {    y++;
//                         break;
//                     }
//                     default:
//                         break;
//                 }
//             }
//         }
        
//         return ((x==0 && y==0) || angle!=0);
            
//     }
// }

// https://www.youtube.com/watch?v=nKv2LnC_g6E