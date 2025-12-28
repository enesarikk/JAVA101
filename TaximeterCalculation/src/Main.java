import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int km, fp = 10;
        double perKm = 2.20, total;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter the distance in kilometers. : ");
        km = inp.nextByte();

        total = (km * perKm) + fp;
        total = (total <= 20) ? 20 : total;
        System.out.println("The amount you need to pay : " + total);

    }
}