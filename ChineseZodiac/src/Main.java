import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, mod;
        Scanner logic = new Scanner(System.in);

        System.out.print("Enter your year of birth. : ");
        year = logic.nextInt();
        String sign = "";

        mod = year % 12;

        switch (mod) {
            case (0) -> sign = "Monkey";
            case (1) -> sign = "Cockerel";
            case (2) -> sign = "Dog";
            case (3) -> sign = "Pig";
            case (4) -> sign = "Mouse";
            case (5) -> sign = "Ox";
            case (6) -> sign = "Tiger";
            case (7) -> sign = "Rabbit";
            case (8) -> sign = "Dragon";
            case (9) -> sign = "Snake";
            case (10) -> sign = "Horse";
            case (11) -> sign = "Sheep";
        }
        System.out.println("Your Chinese zodiac sign : " + sign);
    }
}