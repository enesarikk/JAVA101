import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        Scanner grs = new Scanner(System.in);
        System.out.print("Enter the number n for the combination. : n = ");
        n = grs.nextInt();
        System.out.print("Enter the number r for the combination. : r = ");
        r = grs.nextInt();
        ;
        int total = 1, sum = 1, minus = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        for (int k = 1; k <= r; k++) {
            sum = sum * k;
        }
        for(int m = 1; m <= (n-r); m++)
            minus = minus * m;
        System.out.println(n + " in " + r +  " combination : " + (total / (sum * (minus))));
    }
}