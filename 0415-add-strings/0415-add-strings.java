class Solution {
    public String addStrings(String num1, String num2) {
        // return Long.toString(Long.parseLong(num1)+Long.parseLong(num2));

        int p1=num1.length()-1;
        int p2=num2.length()-1;
        int carry=0;
        StringBuilder result = new StringBuilder();

        while(p1>=0||p2>=0||carry!=0) 
        {
            int a=(p1>=0)?num1.charAt(p1)-'0':0;
            int b=(p2>=0)?num2.charAt(p2)-'0':0; 
            int sum=a+b+carry;
            int digit=sum%10;
            carry = sum/10;
            result.append(digit);
            p1--;
            p2--;
        }
        return result.reverse().toString();
    }
}

// class Solution {
//     public String addStrings(String num1, String num2) {
//        java.math.BigInteger a = new java.math.BigInteger(num1);
//        java.math.BigInteger b = new java.math.BigInteger(num2);
//        a = a.add(b);
//        return a.toString();
//     }
// }