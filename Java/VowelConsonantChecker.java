import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        if (isVowel(inputChar)) {
            System.out.println(inputChar + " is a Vowel");
        } else {
            System.out.println(inputChar + " is a Consonant.");
        }

        scanner.close();
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
