class Solution {
    public int missingNumber(int[] arr) {
        int sum1 =0;
        int sum2=0;
        for(int i=0 ; i<arr.length ;i++){
            sum1 += arr[i];
            sum2 += i+1;
        }
        return sum2-sum1;
    }
}