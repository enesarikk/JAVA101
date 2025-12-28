import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 1, ebob = 1;
        Scanner grs = new Scanner(System.in);

        System.out.print("Enter the numbers. : ");
        int n1 = grs.nextInt();
        System.out.print("Enter the numbers. : ");
        int n2 = grs.nextInt();

        int min = ( n1 < n2) ? n1 : n2;

        while (x<=min){
        if ((n1 % x == 0) && (n2 % x == 0)){
            ebob = x;
        }
            x++;
        }
        System.out.println(n1 + " and " + n2 + " the greatest common divisor of the numbers : " + ebob);
        int ekok = (n1 * n2) / ebob;
        System.out.println(n1 + " and " + n2 + " the least common multiple of the numbers : " + ekok);
    }
}