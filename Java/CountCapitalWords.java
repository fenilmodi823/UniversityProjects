import java.util.Scanner;

public class CountCapitalWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int count = countCapitalWords(sentence);
        System.out.println("Number of words with the first letter in uppercase: " + count);

        scanner.close();
    }

    public static int countCapitalWords(String sentence) {
        String[] words = sentence.split("\\s+");

        int count = 0;
        for (String word : words) {
            if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }

        return count;
    }
}
