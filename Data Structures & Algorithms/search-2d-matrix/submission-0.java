class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int s = 0;
        int e = matrix.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (matrix[m][0] == target) {
                return true;
            }
            if (matrix[m][0] < target &&
                matrix[m][matrix[0].length - 1] >= target) {

                int s1 = 0;
                int e1 = matrix[0].length - 1;

                while (s1 <= e1) {
                    int m1 = s1 + (e1 - s1) / 2;

                    if (matrix[m][m1] == target) {
                        return true;
                    } else if (matrix[m][m1] > target) {
                        e1 = m1 - 1;
                    } else {
                        s1 = m1 + 1;
                    }
                }

                return false;
            }
            else if (matrix[m][matrix[0].length - 1] < target) {
                s = m + 1;
            }
            else {
                e = m - 1;
            }
        }

        return false;
    }
}