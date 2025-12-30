import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner arc = new Scanner(System.in);
        System.out.print("Determine the maximum number for a prime number. : ");
        int border = arc.nextInt();

        for (int i = 2; i < border; i++) {
            boolean isPrime = true;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}