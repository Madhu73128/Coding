class Solution {
    public String reverseOnlyLetters(String s) {
        int n=s.length();
        int p1=0,p2=n-1;
        char ch[]=s.toCharArray();
        while(p1<=p2)
        {
            char ch1=ch[p1];
            char ch2=ch[p2];
            if(Character.isLetter(ch1)&&Character.isLetter(ch2))
            {
                ch[p1++]=ch2;
                ch[p2--]=ch1;
            }
            if(!Character.isLetter(ch1))
            {
                p1++;
            }
            if(!Character.isLetter(ch2))
            {
                p2--;
            }
        }
        return new String(ch);
    }
}