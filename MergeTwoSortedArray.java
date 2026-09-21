class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int f = m+n;
        
        int[] ans = new int[f];
        for(int i = 0; i < n ; i++){
            ans[i] = nums1[i];
            
        }
        int j = 0;
        for(int i = n; i < f; i++){
            ans[i] = nums2[j];
            j++;
        }
       Arrays.sort(ans);
        if(f % 2 == 0){
            int mid = f / 2;
            double a = (double)(ans[mid] + ans[mid-1])/2;
            return a;
            
        }
        else{
            int mid = f / 2;
            return ans[mid];
            
        }
    }
}
