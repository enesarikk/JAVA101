import java.util.Scanner;

public class Main {
    static int add(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("Addition Operation : " + result);
        return result;
    }

    static int sub(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("Subtraction Operation : " + result);
        return result;
    }

    static int mul(int n1, int n2) {
        int result = n1 * n2;
        System.out.println("Multiplication Operation : " + result);
        return result;
    }

    static int div(int n1, int n2) {
        if (n2 == 0){
            System.out.println("The second digit must be different from 0.");
            return 0;
        }
        int result = n1 / n2;
        System.out.println("Division Operation : " + result);
        return result;
    }
    static int pow(int n1, int n2){
        int result = 1;
        for(int i = 1; i <= n2; i++){
            result *=n1;
        }
        return result;
    }
    static int mod(int n1, int n2){
        return n1 % n2;
    }
    static void rectangle(int n1,int n2){
        System.out.println("Perimeter of a rectangle : " + (2*(n1+n2)));
        System.out.println("Area of a rectangle : " + n1*n2);
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int select;

        String menu = "1-) Addition Operation\n"
                + "2-) Subtraction Operation\n"
                + "3-) Multiplication Operation\n"
                + "4-) Division Operation\n"
                + "5-) Calculating Exponents\n"
                + "6-) MOD Function\n"
                + "7-) Finding the area and perimeter of a rectangle.\n"
                + "0-) EXIT";

        System.out.println(menu);
        while (true) {
            System.out.print("Choose an action. : ");
            select = value.nextInt();
            if (select == 0) break;
            System.out.print("Enter the first digit. : ");
            int n1 = value.nextInt();
            System.out.print("Enter the second digit. : ");
            int n2 = value.nextInt();

            switch (select) {
                case 1:
                    add(n1, n2);
                    break;
                case 2:
                    sub(n1, n2);
                    break;
                case 3:
                    mul(n1, n2);
                    break;
                case 4:
                    div(n1, n2);
                    break;
                case 5:
                    System.out.println("Calculating Exponents : " + pow(n1,n2));
                    break;
                case 6:
                    System.out.println("MOD Function : " + mod(n1,n2));
                    break;
                case 7:
                    rectangle(n1,n2);
                    break;
                default:
                    System.out.println("You selected an invalid option.");
            }
        }
        System.out.println("May Allah be with you and help you.");
    }
}