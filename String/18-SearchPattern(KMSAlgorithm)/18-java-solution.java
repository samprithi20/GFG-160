class Solution {
    static void LPS(String pat, int[] lps){
        int len = 0;
        lps[0] = 0;
        
        int i = 1;
        while(i < pat.length()){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = lps[len - 1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
    
    ArrayList<Integer> search(String pat, String txt) {
        int txt_len = txt.length();
        int pat_len = pat.length();
        
        int lps[] = new int[pat_len];
        ArrayList<Integer> res = new ArrayList<>();
        LPS(pat,lps);
        
        int i = 0, j = 0;
        
        while(i < txt_len){
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
                if(j == pat_len){
                    res.add(i - j);
                    j = lps[j - 1];
                }
            }
            else{
                if(j != 0){
                    j = lps[j - 1];
                }
                else{
                    i++;
                }
            }
        }
        return res;
    }
}