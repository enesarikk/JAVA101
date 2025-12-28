import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, total = 0;
        Scanner entry = new Scanner(System.in);

        do {
            System.out.print("Please enter the number : ");
            x = entry.nextInt();
            if ((x % 2 == 0) && (x % 4 == 0)) {
                total += x;
            }
        } while (x % 2 == 0);
        
        System.out.println("The sum of the numbers : " + total);
    }
}