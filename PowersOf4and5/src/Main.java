import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("To what power would you like to take the power? : ");
        k = sc.nextInt();

        for (int i = 1; i <= k; i *= 4) {
            System.out.println("Powers of 4 : " + i);
        }
        for (int a = 1; a <= k; a *= 5) {
            System.out.println("Powers of 5 : " + a);
        }
    }
}