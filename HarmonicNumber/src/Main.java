import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number N : ");
        int n = input.nextInt();
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            result += (1.0/i);
        }
        System.out.println(result);
    }
}