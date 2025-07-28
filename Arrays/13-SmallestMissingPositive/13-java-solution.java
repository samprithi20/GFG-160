class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        
        for(int i = 0;i < n;i++){
            while(arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]){
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
        }
        
        for(int i = 0; i < n;i++){
            if(i + 1 != arr[i]){
                return i + 1;
            }
        }
        return n + 1;
    }
}
