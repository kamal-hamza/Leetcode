import java.util.ArrayList;

class solution {

    public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int row[] = matrix[i];
            for (int j = 1; j < matrix.length + 1; j++) {
                if (contains(row, j)) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }

        for (int k = 0; k < matrix.length; k++) {
            ArrayList<Integer> col = new ArrayList<Integer>();
            for (int l = 0; l < matrix.length; l++) {
                col.add(matrix[l][k]);
            }
            for (int m = 1; m < matrix.length + 1; m++) {
                if (col.contains(m)) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean contains(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num == val) {
                return true;
            }
        }
        return false;
    }

    public static int[] add(int n, int arr[], int x) {
       int i;
       int newarr[] = new int[n + 1];
       for (i = 0; i < n; i++) {
           newarr[i] = arr[i];
       }
       newarr[n] = x;
       return newarr;
   }

}