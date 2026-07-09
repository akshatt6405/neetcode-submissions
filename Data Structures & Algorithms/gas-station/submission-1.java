class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;

        for (int i = 0; i < n; i++) {

            int total = 0;
            int curr = i;
            int count = 0;

            while (count < n) {

                total += gas[curr] - cost[curr];

                if (total < 0) {
                    break;
                }

                curr = (curr + 1) % n;
                count++;
            }

            if (count == n) {
                return i;
            }
        }

        return -1;
    }
}