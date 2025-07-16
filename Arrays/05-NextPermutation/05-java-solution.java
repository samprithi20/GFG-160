class Solution {
    void nextPermutation(int[] arr) {
        int pivot = -1;
        int n = arr.length;
        
        for(int i = n - 2; i >= 0;i--){
            if(arr[i] < arr[i + 1]){
                pivot = i;
                break;
            }
        }
        
        if(pivot == -1){
           reverse(arr, 0, n - 1);
           return;
        }
        
        for(int i = n - 1; i > pivot; i--){
            if(arr[i] > arr[pivot]){
                swap(arr, i, pivot);
                break;
            }
        }
        reverse(arr, pivot + 1, n - 1);
    }
    
    public static void reverse(int arr[], int start, int end){
        while(start < end){
            swap(arr, start++, end--);
        }
    }
    
    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}