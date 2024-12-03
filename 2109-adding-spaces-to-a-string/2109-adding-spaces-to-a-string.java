class Solution {
    public String addSpaces(String s, int[] spaces) {
         StringBuilder ans = new StringBuilder();
        int j = 0; // Pointer for the spaces array
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (j < spaces.length && i == spaces[j]) {
                ans.append(" ");
                j++;
            }
            ans.append(s.charAt(i));
        }

        return ans.toString();
    }
}