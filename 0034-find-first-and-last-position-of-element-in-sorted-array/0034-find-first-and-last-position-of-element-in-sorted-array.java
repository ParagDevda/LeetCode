class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ans = {-1,-1};
        // boolean found = false;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                ans[0]=mid;
                // found = true;
                end = mid-1;
            } else if (nums[mid]<target) {
                start = mid+1;
            }else{
                end=mid -1;
            }
        } 
        start=0;
        end=nums.length -1;
         while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                ans[1]=mid;
                // found = true;
                start = mid+1;
            } else if (nums[mid]<target) {
                start = mid+1;
            }else{
                end=mid -1;
            }
        } 
        // if(found ==false){
        //     ans[0]=-1;
        //     ans[1]=-1;
        // }
        return ans;
    }
}