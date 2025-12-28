import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number. : ");
        n1 = input.nextInt();
        System.out.print("Enter the second number. : ");
        n2 = input.nextInt();
        System.out.print("Enter the third number. : ");
        n3 = input.nextInt();

        if ((n1 < n2) && (n1 < n3)) {
            if (n2 < n3) {
                System.out.println("n1 < n2 < n3");
            } else {
                System.out.println(" n1 < n3 < n2");
            }
        } else if ((n2 < n1) && (n2 < n3)) {
            if (n1 < n3) {
                System.out.println("n2 < n1 < n3");
            } else {
                System.out.println("n2 < n3 < n1");
            }

        } else {
            if (n1 < n2) {
                System.out.println("n3 < n1 < n2");
            } else {
                System.out.println("n3 < n2 < n1");
            }
        }
    }
}