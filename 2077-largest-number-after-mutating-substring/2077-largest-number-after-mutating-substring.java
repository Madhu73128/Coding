class Solution {
    public String maximumNumber(String num, int[] change) {
        int n=num.length();
        StringBuilder sb=new StringBuilder();
        boolean substringstart=false;
        for(int i=0;i<n;i++)
        {
            int idx=num.charAt(i)-'0';
            if(idx==change[idx])
            {
                sb.append(idx);
            }
            else if(idx<change[idx])
            {
                sb.append(change[idx]);
                substringstart=true;
            }
            else
            {
                sb.append(idx);
                if(substringstart==true)
                    break;
            }
        }
        /*int len=sb.length();
        if(len!=n)
        {
            sb.append(num.substring(len));
        }*/
        sb.append(num.substring(sb.length()));
        return sb.toString();
    }
}