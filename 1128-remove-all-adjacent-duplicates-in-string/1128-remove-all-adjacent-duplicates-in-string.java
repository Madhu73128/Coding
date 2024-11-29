class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(stk.isEmpty())//stk.size()==0;
            {
                stk.push(ch);
            }
            else if(stk.peek()==ch)//topmost of stack(previous character)==current character
            {
                stk.pop();
            }
            else//topmost of stack(previous character)!=current character
            {
                stk.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();//for appending remaining character of stack to sb
        for(char ch:stk)
        {
            sb.append(ch);
        }
        return sb.toString();

    }
}