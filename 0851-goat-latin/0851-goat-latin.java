class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb=new StringBuilder();
        List<Character> al=List.of('a','e','i','o','u','A','E','I','O','U');
        String words[]=sentence.split(" ");
        for(int i=0;i<words.length;i++)
        {
            if(al.contains(words[i].charAt(0)))
            {
                sb.append(words[i]);
            }
            else
            {
                sb.append(words[i].substring(1,words[i].length()))
                .append(words[i].charAt(0));
            }
            sb.append("ma")
            .append("a".repeat(i+1))
            .append(" ");
        }
        return sb.toString().trim();
    }
}