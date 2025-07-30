class Solution {
    static final int MAX_CHAR = 26;
    
    public char nonRepeatingChar(String s) {
        
        int visited[] = new int[MAX_CHAR];
        Arrays.fill(visited, -1);
        
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(visited[index] == -1){
                visited[index] = i;
            }
            else{
                visited[index] = -2;
            }
        }
        int idx = -1;
        for(int i = 0;i < MAX_CHAR; i++){
            if(visited[i] >= 0 &&(idx == -1 || visited[i] < visited[idx])){
                idx = i;
            }
        }
        
        return (idx == -1) ? '$':s.charAt(visited[idx]);
        
    }
}
