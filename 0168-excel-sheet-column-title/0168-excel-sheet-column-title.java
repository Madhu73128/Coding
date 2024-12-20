class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
		StringBuilder sb = new StringBuilder();
		while (n>0) 
		{
			int rem=n%26;
			if (rem==0)
			{
				sb.append("Z");
				n= n/26-1;
			}
			else
			{
				sb.append((char)(rem-1+'A'));
				n=n/26;
			}
		}
        return sb.reverse().toString();
    }
}