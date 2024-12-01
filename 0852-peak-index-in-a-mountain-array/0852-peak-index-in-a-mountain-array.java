class Solution {
     public static int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length-1;
        // int max = arr[0];
        // int i = 0;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else {
                start = mid +1;
            }
        }
        return start;
    }
}