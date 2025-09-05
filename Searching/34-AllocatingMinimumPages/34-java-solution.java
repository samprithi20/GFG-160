class Solution {
    public boolean check(int arr[], int k, int limit){
        int pageSum = 0;
        int count = 1;
        
        for(int i = 0;i < arr.length;i++){
            if(pageSum + arr[i] > limit){
                count++;
                pageSum = arr[i];
            }
            else{
                pageSum = pageSum + arr[i];
            }
        }
        return count <= k;
    }
    public int findPages(int[] arr, int k) {
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        
        if(k > arr.length) return -1;
        
        int res = -1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(check(arr, k, mid)){
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
        
    }
}