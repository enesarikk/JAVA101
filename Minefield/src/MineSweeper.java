import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row, col, size;
    int[][] mine;
    int[][] map;
    boolean game = true;

    Random random = new Random();
    Scanner input = new Scanner(System.in);

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mine = new int[row][col];
        this.map = new int[row][col];
        this.size = row * col;
    }

    public void run() {
        int rowth, colth, success = 0 ;
        mineLaying();
        print(this.mine);
        System.out.println(" ----- The game has begun! ------");
        while (game) {
            print(map);
            System.out.print("Row : ");
            rowth = input.nextInt();
            System.out.print("Column : ");
            colth = input.nextInt();

            if(rowth < 0 || rowth >= row){
                System.out.println("Invalid coordinates!");
                continue;
            }
            if(colth < 0 || colth >= col){
                System.out.println("Invalid coordinates!");
                continue;
            }
            if (mine[rowth][colth] != -1) {
                checkMine(rowth, colth);
                success++;
                if(success == (size) - (size/4)){
                    System.out.println(" ===== Congratulations ! ===== ");
                    break;
                }
            } else {
                game = false;
                System.out.println(" *** GAME OVER ! *** ");
            }
        }
    }

    public void checkMine(int r, int c) {
        if (mine[r][c] == 0) {
            if ((c < col - 1) && (mine[r][c + 1] == -1)) {
                map[r][c]++;
            }
            if ((r < row - 1) && (mine[r + 1][c] == -1)) {
                map[r][c]++;
            }
            if ((r > 0 ) && (mine[r - 1][c] == -1)) {
                map[r][c]++;
            }
            if ((c > 0 ) && (mine[r][c - 1] == -1)) {
                map[r][c]++;
            }
            if (map[r][c] == 0) {
                map[r][c] = -2;
            }
        }
    }

    public void mineLaying() {
        int mineRow, mineCol, count = 0;
        while (count != (size / 4)) {
            mineRow = random.nextInt(row);
            mineCol = random.nextInt(col);
            if (mine[mineRow][mineCol] != -1) {
                mine[mineRow][mineCol] = -1;
                count++;
            }
        }
    }

    public void print(int[][] array) {
        for (int[] r : array) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
