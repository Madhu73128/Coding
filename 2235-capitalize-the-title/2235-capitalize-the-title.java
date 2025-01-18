class Solution {
    public String capitalizeTitle(String title)
    {
        String words[]=title.toLowerCase().split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:words)
        {
            if(word.length()>2)
            sb.append(Character.toTitleCase(word.charAt(0))).append(word.substring(1)).append(" ");
            else
            sb.append(word).append(" ");
        }   
        return sb.toString().trim();
    }


    // StringBuilder titleCase = new StringBuilder(input.length());
    // boolean nextTitleCase = true;

    // for (char c : input.toCharArray()) {
    //     if (Character.isSpaceChar(c)) {
    //         nextTitleCase = true;
    //     } else if (nextTitleCase) {
    //         c = Character.toTitleCase(c);
    //         nextTitleCase = false;
    //     }

    //     titleCase.append(c);
    // }

    // return titleCase.toString();
}