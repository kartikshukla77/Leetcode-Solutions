class Solution {
    public void sortColors(int[] nums) {
        // put all 2's in end and 0's in start 
        int start = 0; 
        int end = nums.length-1;
        int i = 0;

        while(i <= end){
            if(nums[i]==0){    // if we found 0 we swap it with start 
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                start++;
                i++;
            }else if(nums[i]==2){
                int temp = nums[end];
                nums[end] = nums[i];
                nums[i] = temp;
                end--;
                // note we didn't increment i bcs when we swapped 2 with end the no we would have got is 0.
                // so if we increment i we will miss to sort that 0.
            }else{
                i++; 
            }
        }
        
    }
}