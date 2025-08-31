class Solution {
    int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == key) return mid;
            
            if(arr[low] <= arr[mid]){
                if(key <= arr[mid] && key >= arr[low]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(arr[mid] <= key && key <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}