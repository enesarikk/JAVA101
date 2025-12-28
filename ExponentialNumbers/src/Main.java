import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base, exponent, total =1;
        Scanner value = new Scanner(System.in);

        System.out.print("Enter the base number. : ");
        base = value.nextInt();
        System.out.print("Enter the exponent. : ");
        exponent = value.nextInt();

        for(int i =1; i <= exponent; i++){
            total = total * base;
        }
        System.out.println("Answer : " + total);
    }
}
