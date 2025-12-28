import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, turkishLanguage, chemistry, music;
        Scanner mark = new Scanner(System.in);

        System.out.print("Please enter the Math grade. : ");
        math = mark.nextInt();

        System.out.print("Please enter the Physics grade. : ");
        physics = mark.nextInt();

        System.out.print("Please enter the Turkish Language grade. : ");
        turkishLanguage = mark.nextInt();

        System.out.print("Please enter the Chemistry grade. : ");
        chemistry = mark.nextInt();

        System.out.print("Please enter the Music grade. : ");
        music = mark.nextInt();

        double average = (math + physics + turkishLanguage + chemistry + music) / 5.0;
        if (average <= 55) {
            System.out.println("You failed the class.");
        } else {
            System.out.println("You passed the class.");
        }

        System.out.println("Your grade point average : " + average);

    }
}