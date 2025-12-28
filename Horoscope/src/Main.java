import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        String horoscope = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your date of birth. : ");
        day = input.nextInt();
        System.out.print("Enter your birth month. : ");
        month = input.nextInt();

        if ((month == 12 && day > 21 && day <= 31) || (month == 1 && day > 0 && day <= 19)) {
            horoscope = "Capricorn";
        } else if ((month == 1 && day > 19 && day <= 31) || (month == 2 && day > 0 && day <= 18)) {
            horoscope = "Aquarius";
        } else if ((month == 2 && day > 18 && day <= 28) || (month == 3 && day > 0 && day <= 20)) {
            horoscope = "Pisces";
        } else if ((month == 3 && day > 20 && day <= 31) || (month == 4 && day > 0 && day <= 19)) {
            horoscope = "Aries";
        } else if ((month == 4 && day > 19 && day <= 30) || (month == 5 && day > 0 && day <= 20)) {
            horoscope = "Taurus";
        } else if ((month == 5 && day > 20 && day <= 31) || (month == 6 && day > 0 && day <= 20)) {
            horoscope = "Gemini";
        } else if ((month == 6 && day > 20 && day <= 30) || (month == 7 && day > 0 && day <= 22)) {
            horoscope = "Cancer";
        } else if ((month == 7 && day > 22 && day <= 31) || (month == 8 && day > 0 && day <= 22)) {
            horoscope = "Leo";
        } else if ((month == 8 && day > 22 && day <= 31) || (month == 9 && day > 0 && day <= 22)) {
            horoscope = "Virgo";
        } else if ((month == 9 && day > 22 && day <= 30) || (month == 10 && day > 0 && day <= 22)) {
            horoscope = "Libra";
        } else if ((month == 10 && day > 22 && day <= 31) || (month == 11 && day > 0 && day <= 21)) {
            horoscope = "Scorpio";
        } else if ((month == 11 && day > 21 && day <= 30) || (month == 12 && day > 0 && day <= 21)) {
            horoscope = "Sagittarius";
        }

        if ((month > 0 && month <= 12) && (day > 0 && day <= 31)){
            System.out.println("Your zodiac sign : " + horoscope);
        } else {
            System.out.println("You entered the wrong day or month.");
        }


    }
}
