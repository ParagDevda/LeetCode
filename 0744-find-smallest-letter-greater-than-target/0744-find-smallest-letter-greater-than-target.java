class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int start = 0 ;
        int end = n-1;
        // char ans =letters[0];
        if(target>=letters[n-1]){
            return letters[0];
        }else{

            while(start<=end){
               int mid = start + (end-start)/2;
                if(letters[mid]==target){
                    // ans =letters[mid+1];
                    start = mid +1;
                }
                else if(target>letters[mid]){
                    start = mid+1;
                }else if (target<letters[mid]){
                    end = mid-1;
                }   
            }
            // if(ans==letters[0]){
            //     ans = letters[start];
            // }

        }
        return letters[start];
    }
}