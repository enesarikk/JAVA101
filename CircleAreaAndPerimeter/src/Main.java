import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14, area, perimeter, slice,angle;
        Scanner number = new Scanner(System.in);

        System.out.print("Enter the radius of the circle. : ");
        r = number.nextInt();

        area = pi * r * r;
        perimeter = 2 * pi * r;

        System.out.print("Enter the angle of the area you wish to calculate. : ");
        angle = number.nextDouble();
        slice = (pi * (r*r) * angle) / 360;

        System.out.println("The area of the circle : " + area);
        System.out.println("The perimeter of the circle : " + perimeter);
        System.out.println("Area of a circular slice : " + slice);

    }
}