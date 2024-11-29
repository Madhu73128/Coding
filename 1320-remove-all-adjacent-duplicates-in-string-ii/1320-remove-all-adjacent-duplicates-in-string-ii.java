class Solution {
    class Pair
    {
        char chr;
        int count;
        Pair(char chr,int count)
        {
            this.chr=chr;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        int n=s.length();
        if(n<k)
        return s;
        Stack<Pair> stk=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(stk.isEmpty()||stk.peek().chr!=s.charAt(i))
            {
                stk.push(new Pair(s.charAt(i),1));
            }
            else //if(stk.peek().ch==s.charAt(i))
            {
                Pair previous=stk.pop();
                stk.push(new Pair(s.charAt(i),previous.count+1));
            }
            if(stk.peek().count==k)
            {
                stk.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(Pair current:stk)
        {
            while(current.count-->0)
            {
                sb.append(current.chr);
            }
        }
        return sb.toString();
    }
}