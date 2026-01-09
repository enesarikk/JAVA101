import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arc = {1, 2, 4, 8};
        double total = 0.0, harmonic = 0.0;

        for(int bit : arc){
            total += bit;
            harmonic += (1.0/bit);
        }

        double average = total / arc.length;
        double hAverage = arc.length / harmonic;

        System.out.println("Average of the elements in the series : " + average);
        System.out.println("The harmonic mean of the numbers in the sequence : " + hAverage);
    }
}