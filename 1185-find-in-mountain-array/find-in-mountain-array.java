/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution{
// FIND THE PEAK ELEMENT IN THE FIRST PLACE
    public int findInMountainArray(int target, MountainArray arr) {

        int i = 0 ; 
        int j = arr.length()-1;

        while(i < j ){
            int mid = i + (j-i)/2;

            if(arr.get(mid) < arr.get(mid+1) ){
                i = mid+1;
            }else{
                j = mid;
            }
        }

        int peak = i;

        if(target==arr.get(peak)){
            return peak;
        }
        
        int leftIdx = leftSearch( target , arr , 0 , peak-1 );
        if(leftIdx==-1){
              int rightIdx=  rightSearch(target , arr , peak+1 , arr.length()-1 );
              if(rightIdx!=-1){
                return rightIdx;
              }

        }else{
            return leftIdx;
         }
        
        return -1;
 
    }

// FIND THE TARGET IN THE LEFT SIDE OF ARRAY (ASCENDING)
    public int leftSearch(int target , MountainArray arr ,int start  , int end){

         while(start <= end ){
            int mid = start + (end-start)/2;

            if(arr.get(mid) == target ){
                return mid;
            }else if(target < arr.get(mid)){
                end = mid-1;

            }else{
                start = mid+1;
            }
        }

        return -1;
    }

// FIND THE TARGET IN THE RIGHT SIDE OF ARRAY (DESCENDING)    

    public int rightSearch(int target , MountainArray arr ,int start  , int end){

         while(start <= end ){
            int mid = start + (end-start)/2;

            if(arr.get(mid) == target ){
                return mid;
            }else if(target < arr.get(mid)){
                start = mid+1;

            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}