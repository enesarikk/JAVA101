import java.util.Scanner;

public class Main {
    static void loop(int number){
        System.out.print(number + " ");
        if(number > 0){
            loop(number-5);
            System.out.print(number + " ");
        }
    }
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = entry.nextInt();
        loop(num);
    }
}