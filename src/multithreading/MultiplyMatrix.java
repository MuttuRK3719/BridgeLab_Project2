package multithreading;

public class MultiplyMatrix {
    static int[][] A;
    static int[][] B;
    static int[][] C;

    public static void main(String[] args) throws InterruptedException {
        int rowsA = 3, colsA = 2, rowsB = 2, colsB = 3;
        A = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        B = new int[][]{{7, 8, 9}, {10, 11, 12}};
        C = new int[rowsA][colsB];
        Thread[] threads = new Thread[rowsA];
        for (int i = 0; i < rowsA; i++) {
            final int row = i;
            threads[i] = new Thread(() -> multiplyRow(row));
            threads[i].start();
        }
//        for (Thread t : threads) {
//            t.join();
//        }
        System.out.println("Resultant Matrix C:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplyRow(int row) {
        for (int j = 0; j < B[0].length; j++) {
            int sum = 0;
            for (int k = 0; k < B.length; k++) {
                sum += A[row][k] * B[k][j];
            }
            C[row][j] = sum;
        }
    }
}
//27 30 33
//61 68 75
//95 106 117