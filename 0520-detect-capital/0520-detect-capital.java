class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        boolean flag=false;
        if(Character.isUpperCase(word.charAt(0))&&n>1&&Character.isUpperCase(word.charAt(1)))
        {
            flag=true;
        }
        for(int i=1;i<n;i++)
        {
            if(flag)//if first 2 characters are upper and next any character is lower then return false;
            {
                if(Character.isLowerCase(word.charAt(i)))
                return false;
            }
            else//if first character is lower and next any character is upper then return false
            {
                if(Character.isUpperCase(word.charAt(i)))
                return false;
            }
        }
        return true;
    }
}