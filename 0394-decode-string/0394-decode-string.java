class Solution {
    public String decodeString(String s) {
        Stack<Pair<String,Integer>> stack=new Stack<>();
        StringBuilder currentString=new StringBuilder();
        int num=0;

        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                num=num*10+(ch-'0');
            }
            else if(ch=='[')
            {
                stack.push(new Pair<>(currentString.toString(),num));
                currentString.setLength(0);
                num=0;
            }
            else if(ch==']')
            {
                Pair<String,Integer> topOfStack=stack.pop();
                StringBuilder actualStringToAdd=new StringBuilder(topOfStack.getKey());
                for(int i=0;i<topOfStack.getValue();i++)
                {
                    actualStringToAdd.append(currentString);
                }
                currentString=actualStringToAdd;
            }
            else
            {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }
}