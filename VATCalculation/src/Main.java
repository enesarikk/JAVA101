import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double price, vatAmount, vatIncluded, vat1 = 0.18, vat2 = 0.08;
        Scanner vrb = new Scanner(System.in);

        System.out.print("Enter the monetary value : ");
        price = vrb.nextDouble();

        double vat = price >= 0 && price <1000 ? vat1 : vat2;

        vatAmount = price * vat;
        vatIncluded = price + vatAmount;

        System.out.println("Excluding Vat : " + price);
        System.out.println("VAT rate : " + vat);
        System.out.println("VAT included : " + vatIncluded);
        System.out.println("VAT amount : " + vatAmount);
    }
}