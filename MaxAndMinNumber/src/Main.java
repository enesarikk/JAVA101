import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.print("How many numbers will you enter? : ");
        int unit = entry.nextInt();

        int min = 0, max = 0;
        int number;
        for (int i = 1; i <= unit; i++){
            System.out.print(i + ". enter the number : ");
            number = entry.nextInt();
            if(number < min || min == 0){
                min = number;
            }
            if(number > max){
                max = number;
            }
        }
        System.out.println("The smallest of the entered numbers : " + min);
        System.out.println("The largest of the entered numbers : " + max);
    }
}


