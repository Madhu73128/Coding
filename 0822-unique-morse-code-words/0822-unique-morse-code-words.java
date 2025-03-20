class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs = new HashSet<>();
        HashMap<Character, String> map = new HashMap<>();
        int k = 0;
        for(char i = 'a'; i<='z'; i++)
            map.put(i, code[k++]);

        for(String x : words){
            StringBuilder temp = new StringBuilder();
            for(char ch : x.toCharArray())
                temp.append(map.get(ch));
            hs.add(temp.toString());    
        }
        return hs.size();
        
    }
}