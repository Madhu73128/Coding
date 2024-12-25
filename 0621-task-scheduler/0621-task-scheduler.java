class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        for(char ch:tasks)
        {
            freq[ch-'A']++;
        }
        Arrays.sort(freq);
        int maxFreq=freq[25];
        int idleSlots=(maxFreq-1)*n;
        for(int i=24;i>=0;i--)
        {
            idleSlots-=Math.min(maxFreq-1,freq[i]);
        }
        return tasks.length+Math.max(0,idleSlots);


        // Integer freq[]=new Integer[26];
        // for(char ch:tasks)
        // {
        //     freq[ch-'A']++;//problem here with Integer freq[]
        // }
        // Arrays.sort(freq,Collections.reverseOrder());
        // int ideal=(freq[0]-1)*n;
        // for(int i=1;i<freq.length-1;i++)//exclude first and last why to get clear youtube
        // {
        //     ideal-=Math.min(freq[0]-1,freq[i]);
        // }
        // return tasks.length+Math.max(0,ideal);
    }
}
// https://www.youtube.com/watch?v=Q9006pUcypI