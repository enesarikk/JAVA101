import java.util.Scanner;

public class Main {
    static boolean isPrime(int num, int division) {
        if (num <= 2) {
            return (num == 2) ? true : false;
        }
        if (division * division > num) {
            return true;
        }
        if (num % division == 0) {
            return false;
        }
        return isPrime(num, division + 1);
    }

    public static void main(String[] args) {
        Scanner bit = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int number = bit.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}