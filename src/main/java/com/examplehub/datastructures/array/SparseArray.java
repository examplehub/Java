package com.examplehub.datastructures.array;

/**
 * https://en.wikipedia.org/wiki/Sparse_matrix
 */
public class SparseArray {

    private static final int COL_OF_SPARSE_ARRAY = 3;

    /**
     * Write s sparse array to compression array
     *
     * @param origin the sparse array to write.
     * @return compression array.
     */
    public static int[][] write(int[][] origin) {
        int countZero = 0; /* count the number of non zero */
        for (int[] rows : origin) {
            for (int item : rows) {
                if (item != 0) {
                    countZero++;
                }
            }
        }

        int[][] backup = new int[countZero + 1][COL_OF_SPARSE_ARRAY];
        backup[0][0] = origin.length;
        backup[0][1] = origin[0].length;
        backup[0][2] = countZero;

        int index = 1;
        for (int i = 0; i < origin.length; ++i) {
            for (int j = 0; j < origin[i].length; ++j) {
                if (origin[i][j] != 0) {
                    backup[index][0] = i; /* write row index */
                    backup[index][1] = j; /* write column index */
                    backup[index][2] = origin[i][j]; /* write value */
                    index++;
                }
            }
        }
        return backup;
    }

    /**
     * Read data from compression array
     * @param compression the compression data array.
     * @return the sparse array.
     */
    public static int[][] read(int[][] compression) {
        int[][] sparse = new int[compression[0][0]][compression[0][1]];
        for (int i = 1; i < compression.length; ++i) {
            int rowIndex = compression[i][0];
            int columnIndex = compression[i][1];
            int value = compression[i][2];
            sparse[rowIndex][columnIndex] = value;
        }
        return sparse;
    }
}
