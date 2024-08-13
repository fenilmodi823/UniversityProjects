public class PyramidPattern3 {
    public static void main(String[] args) {
        String str = "stream";

        System.out.println("Pyramid pattern: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}
