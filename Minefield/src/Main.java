import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.println("***** Welcome to the Minesweeper game! *****");
        System.out.println("Enter the dimensions of the game you want to play.");
        System.out.print("Enter the number of rows. : ");
        row = input.nextInt();
        System.out.print("Enter the number of columns. : ");
        col = input.nextInt();

        MineSweeper mineGame = new MineSweeper(row, col);
        mineGame.run();
    }
}