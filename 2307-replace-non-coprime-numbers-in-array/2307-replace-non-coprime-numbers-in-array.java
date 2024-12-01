class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stk=new ArrayList<>();
        for(int num:nums)
        {
            // Push the current number onto the stack
            stk.add(num);
            // While the top two numbers are non-coprime, merge them
            while(stk.size()>1) 
            {
                int top=stk.get(stk.size()-1);
                int secondTop= stk.get(stk.size()-2);
                // If GCD > 1, merge them
                if(GCD(top,secondTop)>1)
                {
                    int lcm=LCM(top,secondTop);
                    stk.remove(stk.size()-1); // Remove the top
                    stk.remove(stk.size()-1); // Remove the second top
                    stk.add(lcm);                // Add the LCM
                }
                else
                {
                    break; // Top two numbers are coprime
                }
            }
        }

        return stk;
    }

    public static int GCD(int a,int b) 
    {
        if(b==0)
        return a;
        return GCD(b,a%b);
    }

    public static int LCM(int a,int b)
    {
        return (a/GCD(a,b))*b; // Prevent overflow by dividing first
    }
}
