class Solution {
    public int countSegments(String s) {
        if(s==null||s.isEmpty()||s.trim()==null||s.trim().isEmpty()||s.trim().length()==0)
        return 0;
        return s.trim().split("\\s+").length;
    }
}