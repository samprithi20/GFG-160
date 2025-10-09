import java.util.*;
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        int n = arr.length;
        
        for(int j = 0; j < n;j++){
            for(int k = j + 1; k < n;k++){
                int sum = arr[j] + arr[k];
                int val = (-1)*sum;
                if(map.containsKey(val)){
                    for(int i : map.get(val)){
                        ans.add(Arrays.asList(i, j, k));
                    }
                }
            }
            map.putIfAbsent(arr[j], new ArrayList<>());
            map.get(arr[j]).add(j);
        }
        return ans;
    }
}