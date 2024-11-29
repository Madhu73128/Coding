class Solution {
    public String removeStars(String s) {
        int n=s.length();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(stk.isEmpty()||s.charAt(i)!='*')
            {
                stk.push(s.charAt(i));
            }
            else
            {
                stk.pop();
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