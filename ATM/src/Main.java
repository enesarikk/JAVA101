import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 1500;

        while (right > 0) {
            System.out.print("ID : ");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();
            if (userName.equals("Java") && password.equals("Development")) {
                System.out.println("Welcome to Patika Bank.");
                do {
                    System.out.println("Menu : \n 1-)Deposit Money \n 2-)Withdraw money \n 3-)Balance Inquiry \n 4-)Exit");
                    System.out.print("Select the action you wish to perform. : ");
                    select = input.nextInt();
                    
                    switch (select) {
                        case 1 -> {
                            System.out.print("The amount you wish to deposit : ");
                            int price = input.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("The amount you wish to withdraw : ");
                            int withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Insufficient balance.");
                                System.out.println("Your current balance : " + balance);
                            } else {
                                balance -= withdraw;
                            }
                        }
                        case 3 -> System.out.println("Your balance : " + balance);
                        case 4 -> System.out.println("You have logged out.");
                        default -> System.out.println("Enter a valid number.");
                    }
                } while (select != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("You entered an incorrect username or password.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact your bank. ");
                } else {
                    System.out.println("Your remaining rights : " + right);
                }
            }
        }
    }
}