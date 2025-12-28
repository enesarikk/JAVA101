import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, type;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers. : ");
        km = inp.nextInt();
        System.out.print("Enter your age. : ");
        age = inp.nextInt();
        System.out.print("Enter your travel type. 1->One Way   2->Round Trip : ");
        type = inp.nextInt();

        double normalTotal, ageDiscount, typeDiscount;

        if (km > 0 && age > 0 && (type == 1 || type == 2)) {
            normalTotal = km * 0.10;
            if (age < 12) {
                ageDiscount = normalTotal * 0.5;
            } else if(age >= 12 && age <= 24){
                ageDiscount = normalTotal * 0.1;
            } else if (age >= 65) {
                ageDiscount = normalTotal * 0.3;
            } else {
                ageDiscount = 0.0;
            }
            normalTotal -= ageDiscount;
            if(type == 2){
                typeDiscount = normalTotal * 0.2;
                normalTotal = (normalTotal - typeDiscount) * 2.0;
            }
            System.out.println("Ticket price : " + normalTotal + " £");
        } else {
            System.out.println("Please check the values you entered.");
        }


    }
}