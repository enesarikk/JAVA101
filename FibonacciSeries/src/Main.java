import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the sequence number. : ");
        int number = value.nextInt();

        int counter = 0;
        int n1 = 0, n2 = 1, n3;
        System.out.print("Fibobacci Series : " + n1 + " " + n2);

        while (counter < (number - 2)) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            counter++;
        }
    }
}