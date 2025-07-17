class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int ele1 = -1, ele2 = -1, cnt1 = 0, cnt2 = 0;
        int n = arr.length;
        
        for(int ele : arr){
            if(ele1 == ele){
                cnt1++;
            }
            else if(ele2 == ele){
                cnt2++;
            }
            else if(cnt1 == 0){
                ele1 = ele;
                cnt1++;
            }
            else if(cnt2 == 0){
                ele2 = ele;
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        
        for(int ele : arr){
            if(ele1 == ele) cnt1++;
            if(ele2 == ele) cnt2++;
        }
        
        if(cnt1 > n/3) res.add(ele1);
        if(cnt2 > n/3 && ele1 != ele2) res.add(ele2);
        
        if(res.size() == 2 && res.get(0) > res.get(1)){
            int temp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, temp);
            
        }
        return res;
        
    }
}