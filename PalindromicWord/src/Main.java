import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String word) {
        int fi = 0;
        int li = word.length() - 1;
        while (fi < li) {
            if (word.charAt(fi) != word.charAt(li)) {
                return false;
            }
            fi++;
            li--;
        }
        return true;
    }

    /*
    static boolean isPalindrome2(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return word.equals(reverse);
    }
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the word you want to enter. : ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println("The word " + word + " is a palindrome.");
        } else {
            System.out.println("The word " + word + " is not a palindrome.");
        }
    }
}