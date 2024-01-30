class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuffer s = new StringBuffer();
        
        for(int i =0; i<word1.length() || i<word2.length(); i++){
            
            if(i<word1.length())
                s.append(word1.charAt(i));
            
            if(i<word2.length())
                s.append(word2.charAt(i));
        }
        return s.toString();
    }
}