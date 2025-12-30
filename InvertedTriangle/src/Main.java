import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bit = new Scanner(System.in);
        int digits;
        System.out.print("Enter the number of digits. : ");
        digits = bit.nextInt();

        for (int i = digits; i >= 1; i--) {
            for (int k = 1; k <= digits - i; k++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= (2 * i) - 1; x++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}