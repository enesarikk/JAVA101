import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sequence = {15, 12, 743, 1, -1, -778, 2, 0};
        int minimum = sequence[0];
        int maximum = sequence[0];

        for (int t : sequence) {
            if (t < minimum) {
                minimum = t;
            }
            if (t > maximum) {
                maximum = t;
            }
        }

        System.out.println("Minimum value : " + minimum);
        System.out.println("Maximum value : " + maximum);
        System.out.println("------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int number = input.nextInt();

        Integer smallClosest = null;
        Integer bigClosest = null;

        for (int unit : sequence) {
            if (unit < number) {
                if (smallClosest == null ||  unit > smallClosest) {
                    smallClosest = unit;
                }
            }
            if (unit > number) {
                if (bigClosest == null || unit < bigClosest) {
                    bigClosest = unit;
                }
            }
        }

        System.out.println("The smallest number closest to the entered number : " + smallClosest);
        System.out.println("the closest larger number to the entered number : " + bigClosest);
    }

}