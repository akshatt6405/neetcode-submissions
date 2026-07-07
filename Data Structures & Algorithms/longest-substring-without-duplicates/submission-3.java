class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] st = new int[150];
        int max = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            st[ch]++;

            while (st[ch] > 1) {
                st[s.charAt(j)]--;
                j++;
            }

            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}