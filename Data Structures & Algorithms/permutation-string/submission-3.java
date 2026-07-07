class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] st = new int[26];
        int c1 = 0;

        for (int i = 0; i < s1.length(); i++) {
            st[s1.charAt(i) - 'a']++;
            c1++;
        }

        int c2 = 0;
        int j = 0;

        for (int i = 0; i < s2.length(); i++) {

            if (st[s2.charAt(i) - 'a'] > 0) {
                c2++;
            }

            st[s2.charAt(i) - 'a']--;

            while (i - j + 1 > s1.length()) {

                st[s2.charAt(j) - 'a']++;

                if (st[s2.charAt(j) - 'a'] > 0) {
                    c2--;
                }

                j++;
            }

            if (c1 == c2) {
                return true;
            }
        }

        return false;
    }
}