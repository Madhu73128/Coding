class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int m=name.length();
        int n=typed.length();
        if(m>n)
        return false;
        int p1=0,p2=0;
        char lastpressed='@';
        while(p2<n)
        {
            if(p1<m&&name.charAt(p1)==typed.charAt(p2))
            {
                p1++;
                lastpressed=typed.charAt(p2);
            }
            else if(typed.charAt(p2)!=lastpressed)
            {
                return false;
            }
            p2++;
        }
        return p1==m;
    }
}