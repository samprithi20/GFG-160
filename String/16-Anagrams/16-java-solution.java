class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        
        HashMap<Character, Integer> count = new HashMap<>();
        
        for(char ch : s1.toCharArray()){
            int value = count.getOrDefault(ch, 0) + 1;
            count.put(ch, value);
        }
        
        for(char ch : s2.toCharArray()){
            int value = count.getOrDefault(ch, 0) - 1;
            count.put(ch, value);
        }
        
        for(var pair : count.entrySet()){
            if(pair.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}