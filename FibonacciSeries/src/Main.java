import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the sequence number. : ");
        int number = value.nextInt();

        int counter = 0;
        int a = 0, b = 1;

        while (counter < number) {
            System.out.print( a+ ", ");
            int temp = a + b;
            a = b;
            b = temp;
            counter++;
        }
    }
}