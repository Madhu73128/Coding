class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null||digits.isEmpty())//digits.length()==0
        {
            return res;
        }
        String buttons[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int n=Integer.parseInt(digits);
        helper(n,"",buttons,res);
        return res;
    }
    public static void helper(int n,String output,String[] buttons,List<String> res)
    {
        if(n==0)
        {
            res.add(output);
            return;
        }
        int lastdig=n%10;
        String s=buttons[lastdig];
        for(int i=0;i<s.length();i++)
        {
            helper(n/10,s.charAt(i)+output,buttons,res);
        }
    }
}