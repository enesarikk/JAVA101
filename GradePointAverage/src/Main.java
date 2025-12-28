import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int maths,physics, chemistry, turkishLanguage, history, music;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your Math grade : ");
        maths = inp.nextInt();

        System.out.print("Enter your Physics grade : ");
        physics = inp.nextInt();

        System.out.print("Enter your Chemistry grade : ");
        chemistry = inp.nextInt();

        System.out.print("Enter your Turkish Language grade : ");
        turkishLanguage = inp.nextInt();

        System.out.print("Enter your History grade : ");
        history = inp.nextInt();

        System.out.print("Enter your Music grade : ");
        music = inp.nextInt();

        int sum = (maths + physics + chemistry + turkishLanguage + history + music);
        double result = sum / 6.0;

        System.out.println("Grade Point Average : " + result);

        String str = result>60 ? "Passing the class" : "Failing a class";
        System.out.println("Your situation : " + str);

    }
}