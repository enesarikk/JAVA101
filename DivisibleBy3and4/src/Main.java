import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, counter = 0;
        double sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number. : ");
        number = input.nextInt();


        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum = i + sum;
                counter++;
            }
        }
        if (counter > 0) {
            double average = sum / counter;
            System.out.println("The average of the divided numbers : " + average);
        } else {
            System.out.println("No conclusion was reached.");
        }
    }
}

