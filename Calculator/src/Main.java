import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, choise;
        Scanner dgr = new Scanner(System.in);

        System.out.print("Enter the first number. : ");
        x = dgr.nextInt();
        System.out.print("Enter the second number. : ");
        y = dgr.nextInt();

        System.out.println("1-) Addition\n2-) Subtraction\n3-) Multiplication\n4-) Division");
        System.out.print("Your coise : ");
        choise = dgr.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Result : " + (x + y));
                break;
            case 2:
                System.out.println("Result : " + (x - y));
                break;
            case 3:
                System.out.println("Result : " + (x * y));
                break;
            case 4:
                if( y!= 0){
                    System.out.println("Result : " + (x/y));
                } else {
                    System.out.println("You cannot divide a number by 0.");
                }
                break;
            default:
                System.out.println("Please enter a valid number.");
        }
    }
}
/*
        if(choise == 1){
            System.out.println("Result : " + (x+y));
        } else if (choise == 2) {
            System.out.println("Result : " + (x-y));
        } else if (choise == 3) {
            System.out.println("Result : " + (x*y));

        }else if (choise == 4){
            if( y!= 0){
                System.out.println("Result : " + (x/y));
            } else {
                System.out.println("You cannot divide a number by 0.");
            }
        } else {
            System.out.println("Please enter a valid number.");
        }

 */