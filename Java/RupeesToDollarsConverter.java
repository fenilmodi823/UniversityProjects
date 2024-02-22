import java.util.Scanner;

public class RupeesToDollarsConverter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the exchange rate (Rupees to Dollars): ");
            double exchangeRate = scanner.nextDouble();

            System.out.print("Enter the amount in Rupees: ");
            double rupees = scanner.nextDouble();

            double dollars = convertRupeesToDollars(rupees, exchangeRate);

            System.out.println(
                    rupees + " Rupees is equal to " + dollars + " Dollars at the exchange rate of " + exchangeRate);
        }
    }

    private static double convertRupeesToDollars(double rupees, double exchangeRate) {
        return rupees / exchangeRate;
    }
}
