class Solution {

    int n;
    int maxOverlap = 0;

    public int largestOverlap(int[][] img1, int[][] img2) {

        n = img1.length;

        tryRowShift(img1, img2, -(n - 1));

        return maxOverlap;
    }

    public void tryRowShift(int[][] img1, int[][] img2, int rowShift) {

        // Base case: all row shifts checked
        if (rowShift > n - 1) {
            return;
        }

        tryColShift(img1, img2, rowShift, -(n - 1));

        // Recursively try next row shift
        tryRowShift(img1, img2, rowShift + 1);
    }

    public void tryColShift(int[][] img1, int[][] img2,
                            int rowShift, int colShift) {

        // Base case: all column shifts checked
        if (colShift > n - 1) {
            return;
        }

        int overlap = countOverlap(img1, img2, rowShift, colShift);

        maxOverlap = Math.max(maxOverlap, overlap);

        // Recursively try next column shift
        tryColShift(img1, img2, rowShift, colShift + 1);
    }

    public int countOverlap(int[][] img1, int[][] img2,
                            int rowShift, int colShift) {

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (img1[i][j] == 1) {

                    int newRow = i + rowShift;
                    int newCol = j + colShift;

                    if (newRow >= 0 && newRow < n &&
                        newCol >= 0 && newCol < n &&
                        img2[newRow][newCol] == 1) {

                        count++;
                    }
                }
            }
        }

        return count;
    }
}