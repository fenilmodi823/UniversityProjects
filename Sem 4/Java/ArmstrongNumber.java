import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    public static boolean isArmstrong(int number) {
        String numString = String.valueOf(number);
        int power = numString.length();
        int sum = 0;

        for (char digit : numString.toCharArray()) {
            int d = Character.getNumericValue(digit);
            sum += Math.pow(d, power);
        }

        return sum == number;
    }
}
