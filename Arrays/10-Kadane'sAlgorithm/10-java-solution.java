class Solution {
    int maxSubarraySum(int[] arr) {
        int maxEnding = arr[0];
        int res = arr[0];
        
        for(int i = 1;i < arr.length;i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
