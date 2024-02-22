public class CramersRule {

    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        double determinant = a * d - b * c;

        if (determinant == 0) {
            System.out.println("The system of equations does not have a unique solution.");
            System.exit(0);
        }

        double x = (e * d - b * f) / determinant;
        double y = (a * f - e * c) / determinant;

        System.out.println("Solution");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}