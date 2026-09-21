class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int maxidx = i;
            for(int j = i; j < n; j++){
                if(nums[j] > nums[maxidx]){
                    maxidx = j;
                }
            }
            int temp = nums[maxidx];
            nums[maxidx] = nums[i];
            nums[i] = temp;
            cnt++;
            if(cnt == k){
                return nums[i];
            }
        }
        return cnt;
    }
}
