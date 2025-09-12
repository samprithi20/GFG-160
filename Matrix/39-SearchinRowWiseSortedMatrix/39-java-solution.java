class Solution {
    public boolean search(int mat[], int x){
        int low = 0;
        int high = mat.length - 1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(mat[mid] == x) return true;
            else if(mat[mid] > x) high = mid - 1;
            else if(mat[mid] < x) low = mid + 1;
        }
        return false;
    }
    public boolean searchRowMatrix(int[][] mat, int x) {
        for(int i = 0;i < mat.length;i++){
            if(search(mat[i], x)) return true;
        }
        return false;
    }
}
