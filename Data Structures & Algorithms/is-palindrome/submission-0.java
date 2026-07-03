class Solution {
    public boolean isPalindrome(String s) {

        String[] ans = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < ans.length; i++) {
           String s1 = ans[i];
            for(int j = 0; j < s1.length(); j++) {

                char ch = s1.charAt(j);

                if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch <= '9')) {

                    sb.append(Character.toLowerCase(ch));
                }
            }
        }

        int i = 0;
        int j = sb.length() - 1;

        while(i <= j) {

            if(sb.charAt(i) != sb.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}