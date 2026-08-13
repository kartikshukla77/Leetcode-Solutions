class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sqArr = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i]*nums[i];
        } 

        int i  = 0 ; 
        int j = nums.length-1;
        int k = sqArr.length-1;

        while(i<=j){
            if(nums[i] > nums[j]){
                sqArr[k] = nums[i];
                i++;
            }else{
                sqArr[k] = nums[j];
                j--;
            }
            k--;
        }

        return sqArr;

    }
}