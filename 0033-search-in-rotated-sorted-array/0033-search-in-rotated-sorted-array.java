class Solution {
    public  int binarysearch(int[] arr,int target,int start , int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid ;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public int pivot(int []arr){
         int start = 0;
            int end = arr.length - 1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(mid<end && arr[mid]>arr[mid+1]){
                    return mid;
                }
                if(mid>start && arr[mid]<arr[mid-1]){
                    return mid - 1;
                }if(arr[mid]<arr[start]){
                    end= mid -1;
                }else {
                    start=mid+1;
                }
            }
            return -1;
    }
    public  int search(int[] nums, int target) {
        int pivot= pivot(nums);
        int ans = binarysearch(nums,target,0,pivot);
        if(ans==-1){
            ans = binarysearch(nums,target,pivot+1,nums.length-1);
        }
       return ans;
    }
}