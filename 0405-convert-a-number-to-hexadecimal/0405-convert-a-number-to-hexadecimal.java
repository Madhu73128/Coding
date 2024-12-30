class Solution {
    public String toHex(int num) {
        // return Integer.toHexString(num);
        // return Integer.toString(num,16); //Not Working due to -ve values
        // return Integer.toUnsignedString(num,16);
        if(num==0)
        return "0";
        long val=num ;
        if(num<0)
        {
            val=(num&0xFFFFFFFFL);
        }
        // String s="0123456789abcdef";
        StringBuilder sb=new StringBuilder();
        while(val!=0)
        {
            int rem=(int)(val%16);
            val/=16;
            if(rem>=10)
            sb.append((char)(rem+87));
            else
            sb.append(rem);
        }
        return sb.reverse().toString();
    }
}
