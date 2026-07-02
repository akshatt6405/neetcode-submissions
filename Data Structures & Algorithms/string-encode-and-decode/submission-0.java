class Solution {

    ArrayList<Integer> lengths = new ArrayList<>();
    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            lengths.add(strs.get(i).length());
            sb.append(strs.get(i));
        }

        return sb.toString();
    }
    public List<String> decode(String s) {

        List<String> ans = new ArrayList<>();

        int start = 0;

        for (int i = 0; i < lengths.size(); i++) {

            int len = lengths.get(i);

            ans.add(s.substring(start, start + len));

            start += len;
        }

        return ans;
    }
}