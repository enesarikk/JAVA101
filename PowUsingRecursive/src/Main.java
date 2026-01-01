import java.util.Scanner;

public class Main {
    static int pow(int base,int exp){
        int result = 1;
        for(int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number. : ");
        int n1 = input.nextInt();
        System.out.print("Enter the exponent number. : ");
        int n2 = input.nextInt();

        System.out.println("Result : " + pow(n1,n2));
    }
}