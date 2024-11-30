class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<String,Long> hm=new HashMap<>();
        long result = 0;

        for (int rect[]:rectangles)
        {
            int gcd=computeGCD(rect[0], rect[1]);
            int width=rect[0]/gcd;
            int height=rect[1]/gcd;

            // Create a unique key for the ratio
            String key=width+"/"+height;

            // Add the count of rectangles with this ratio to the result
            result+=hm.getOrDefault(key, 0L);

            // Update the count for this ratio
            hm.put(key,hm.getOrDefault(key,0L)+1);
        }

        return result;
    }

    // Helper function to compute GCD (Greatest Common Divisor)
    private int computeGCD(int a, int b) {
        if(b==0)
        return a;
        return computeGCD(b,a%b);
    }
}
