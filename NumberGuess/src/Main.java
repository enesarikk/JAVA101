import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Random number = new Random();
        //int random = number.nextInt(100);
        int random = (int) (Math.random() * 11);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int number;
        boolean isWin = false;
        int[] array = new int[5];

        while (right < 5) {
            System.out.print("Please guess a number. : ");
            number = input.nextInt();

            if (number < 0 || number > 10) {
                System.out.println("Please enter a number between 0 and 100!");
                continue;
            }

            if (number == random) {
                System.out.println("Congratulations! You guessed the correct number. ");
                isWin = true;
                break;
            } else {
                System.out.println("You didn't guess the correct number. Try again !");
                if (number > random) {
                    System.out.println("The number " + number + " is greater than the secret number!!");
                } else {
                    System.out.println("The number " + number + " is smaller than the secret number!");
                }
                array[right] = number;
                right++;
                System.out.println("Your remaining rights : " + (5 - right));
            }
        }

        if(!isWin){
            System.out.println("You lost !");
            System.out.println("Your predictions : " + Arrays.toString(array));
        }
        System.out.println("Secret number : " + random);
    }
}