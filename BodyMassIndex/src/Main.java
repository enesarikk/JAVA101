import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double weight, height, index;
        Scanner value = new Scanner(System.in);

        System.out.print("Please enter your weight(kg). : ");
        weight = value.nextDouble();
        System.out.print("Please enter your height(m). : ");
        height = value.nextDouble();

        index = weight / (height * height);

        System.out.println("Your body mass index. : " + index);

    }
}