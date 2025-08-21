package dsa.queue1;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static void main(String[] args) {
        int[][] grids = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(orangesRotting(grids));
    }

    static int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    public static int orangesRotting(int[][] grid) {
        if (grid.length == 0)
            return 0;
        int freshOranges = 0;
        Queue<Integer> que = new LinkedList<>();
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshOranges++;
                }
                if (grid[i][j] == 2) {
                    que.add(i * n + j);
                }
            }
        }
        int min = 0;
        while (!que.isEmpty() && freshOranges > 0) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                int num = que.poll(), row = num / n, col = num % n;
                for (int[] direction : directions) {
                    int x = direction[0] + row, y = direction[1] + col;
                    if (x > -1 && y > -1 && x < m && y < n && grid[x][y] == 1) {
                        que.add(x * n + y);
                        grid[x][y] = 2;
                        freshOranges--;
                    }

                }
            }
            min++;
        }
        return freshOranges == 0 ? min : -1;
    }
}
