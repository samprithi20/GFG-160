class Solution {
    int upper_bound(int arr[], int target){
        int upperBound = arr.length;
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > target){
                upperBound = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return upperBound;
    }
    int lower_bound(int arr[], int target){
        int lowerBound = arr.length;
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target){
                lowerBound = mid;
                high = mid - 1; 
            }
            else{
                low = mid + 1;
            }
        }
        return lowerBound;
    }
    int countFreq(int[] arr, int target) {
        return upper_bound(arr, target) - lower_bound(arr, target);
    }
}
