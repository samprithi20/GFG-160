class Solution {
    static int[] lps(String s){
        int n = s.length();
        int[] lps = new int[n];
        lps[0] = 0;
        int len = 0;
        
        int i = 1;
        while(i < n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0) len = lps[len - 1];
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    
    
    public boolean areRotations(String s1, String s2) {
        String txt = s1 + s1;
        String pat = s2;
        int txt_len = txt.length();
        int pat_len = pat.length();
        
        int[] lps = lps(pat);
        int i = 0, j = 0;
        
        while(i < txt_len){
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
            }
            if(j == pat_len) return true;
            else if(i < txt_len && txt.charAt(i) != pat.charAt(j)){
                if(j != 0) j = lps[j - 1];
                else i++;
            }
        }
        return false;
    }
}