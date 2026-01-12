import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size. : ");
        int size = input.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array.");

        for (int s = 0; s < size; s++) {
            System.out.print((s+1) + ". enter the element. : ");
            array[s] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorting : " +Arrays.toString(array));
    }
}