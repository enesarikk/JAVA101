import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        Scanner entry = new Scanner(System.in);

        System.out.print("Enter your username : ");
        userName = entry.nextLine();
        System.out.print("Enter your password : ");
        password = entry.nextLine();

        if (userName.equals("Patika") && password.equals("Java101")) {
            System.out.println("Login successful.");
        } else {
            System.out.print("Access denied.If you want to reset your password, write 1. : " );
            int choice = entry.nextInt();
            newPassword = entry.nextLine();
            if (choice == 1) {
                System.out.print("Enter your new password. : ");
                newPassword = entry.nextLine();
                if(newPassword.equals("Java101")){
                    System.out.println("Your new password cannot be the same as your old password.");
            } else {
                    System.out.println("Your new password has been successfully created.");
                }

            }
        }

    }
}