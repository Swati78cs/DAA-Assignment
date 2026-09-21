class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        for(int i = 0; i < n; i++){
            if(i == 0){
                if(nums[i] > nums[i+1]) return 0;
                else continue;
            }
            else if(i == n-1 ){
                if(nums[i] > nums[i-1]) return n-1;
                else continue;
            }
            else{
                if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                    return i;
                }
                else continue;
            }
        }
        return 0;
    }
}
