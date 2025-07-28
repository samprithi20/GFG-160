class Solution {
    public int myAtoi(String s) {
        int res = 0;
        int idx = 0;
        int sign = 1;
        
        while(idx < s.length() && s.charAt(idx) == ' '){
            idx++;
        }
        
        if(idx < s.length() && (s.charAt(idx) == '+' || s.charAt(idx) == '-')){
            if(s.charAt(idx++) == '-'){
                sign = -1;
            }
        }
        
        while(idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9'){
            if(res > Integer.MAX_VALUE / 10 || 
            (res == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }
                else{
                    return Integer.MIN_VALUE;
                }
            }
            
            res = res * 10 + (s.charAt(idx++) - '0');
            
        }
        
        return res * sign;
    }
}