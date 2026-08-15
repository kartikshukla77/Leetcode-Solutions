class Solution{
    public int search(int[] arr, int tar){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(tar==arr[mid]){
                return mid;
            } 
            else if(arr[mid] >= arr[start]){                   // It means Left half of array is sorted in asc (we used >= not > because if arr is[3,1] and tar is 1 it goes into right part & returns -1)
                if(tar >= arr[start] && tar < arr[mid]){      //  target is present in sorted part 
                    end=mid-1;
                }else{                                        // target is not present in sorted part 
                    start = mid+1;
                }
            }else{                                            // It means right part is sorted in asc
                if(tar > arr[mid] && tar <= arr[end]){       // tar is present in right part
                    start = mid+1;
                }else{                                       // target is not present in the sorted part  
                    end = mid-1;
                }
            }
        }

        return -1;
    }
}