public class PyramidPattern2 {
    public static void main(String[] args) {
        String str = "stream";

        System.out.println("Pyramid pattern: ");
        for (int i = 0; i <= str.length(); i++) {
            for (int j = 0; j <= str.length(); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(str.charAt(k));
            }
            System.out.println();
        }
    }
}
