class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        HashSet<Integer> a_set = new HashSet<>();
        
        for(int num : a){
            a_set.add(num);
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int num : b){
            if(a_set.contains(num)){
                res.add(num);
                a_set.remove(num);
            }
        }
        
        return res;
    }
}