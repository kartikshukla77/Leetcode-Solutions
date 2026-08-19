class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1; // last el of nums1
        int j = n-1;  // last el of nums2

        int k = nums1.length-1; // if we try to begin from starting it will overwrite the elm

        while(j >=0){
            if((i >=0) && (nums1[i] > nums2[j]) ){ //we wrote i >= 0 to handle case if m = 0 then i gets -1;
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
    }
}