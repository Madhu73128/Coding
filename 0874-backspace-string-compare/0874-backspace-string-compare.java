class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(StackApp(s).equals(StackApp(t)))
        return true;
        return false;
    }
    public static String StackApp(String str)
    {
        int n=str.length();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(stk.isEmpty()&&str.charAt(i)!='#')
            {
                stk.push(str.charAt(i));
            }
            else if(str.charAt(i)=='#')
            {
                if(!stk.isEmpty())
                stk.pop();
                else
                continue;
            }
            else
            {
                stk.push(str.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stk)
        {
            sb.append(ch);
        }
        return sb.toString();
    }
}