class Solution {
    public int maxCircularSum(int arr[]) {
        int curMaxSum = 0;
        int curMinSum = 0;
        int totalSum = 0;
        int maxSum = arr[0];
        int minSum = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            
            curMaxSum = Math.max(curMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, curMaxSum);
            
            curMinSum = Math.min(curMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, curMinSum);
            
            totalSum += arr[i];
        }
        
        int normalSum = maxSum;
        int circularSum = totalSum - minSum;
        
        if(minSum == totalSum){
            return normalSum;
        }
        
        return Math.max(circularSum, normalSum);
    }
}
