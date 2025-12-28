import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b,c;
        Scanner value = new Scanner(System.in);

        System.out.print("Enter the side length : ");
        a = value.nextInt();
        System.out.print("Enter the side length : ");
        b = value.nextInt();
        System.out.print("Enter the side length : ");
        c = value.nextInt();

        double u = (a+b+c) / 2.0;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Area of a triangle : " + area);
        System.out.println("Perimeter of a triangle : " + u*2);

    }
}