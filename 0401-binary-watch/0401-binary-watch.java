class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<12;i++)
        {
            for(int j=0;j<60;j++)
            {
                if(bitCount(i)+bitCount(j)==turnedOn)
                {
                    int len=2-String.valueOf(j).length();//calculating for leading zeros
                    if(len==0)
                    sb.append(i+":"+j);//i=hours,j=mins
                    else
                    sb.append(i+":0"+j);
                    res.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        return res;
    }
    public static int bitCount(int n)
    {
        int count=0;
        while(n>0)
        {
            count+=(n&1);
            n>>=1;
        }
        return count;
    }
}