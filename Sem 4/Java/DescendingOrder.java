import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter three integers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();

            int max = Math.max(num1, Math.max(num2, num3));
            int min = Math.min(num1, Math.min(num2, num3));
            int mid = (num1 + num2 + num3) - max - min;

            System.out.println("The number in descending order are: ");
            System.out.println(max);
            System.out.println(mid);
            System.out.println(min);
        }
    }
}
