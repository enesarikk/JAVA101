import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, numDigits = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter the number : ");
        num = inp.nextInt();

        int tempNum = num;
        int numValue, total = 0;

        while(tempNum !=0){
            tempNum /= 10;
            numDigits++;
        }

        tempNum = num;

        while (tempNum != 0){
            numValue = tempNum % 10;
            total += numValue;
            tempNum /= 10;
        }
        System.out.println("Number of digits : " + numDigits);
        System.out.println("The sum of the digits : " + total);
    }
}