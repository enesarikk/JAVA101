import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int digits;
        System.out.print("Please enter the number of digits. : ");
        digits = value.nextInt();

        for (int i = 1; i <= digits; i++) {
            for (int space = 1; space <= (digits - i); space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= (2 * i) - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (digits - 1); i >= 1; i--) {
            for (int space = 1; space <= (digits - i); space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= (2 * i) - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}