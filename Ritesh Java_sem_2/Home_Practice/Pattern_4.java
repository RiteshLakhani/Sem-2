public class Pattern_4 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print stars
            for (int j = 1; j <= (rows - i) * 2 + 1; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 1; j <= (i - 1) * 4; j++) {
                System.out.print(" ");
            }

            // Print stars (excluding the last row)
            if (i != rows) {
                for (int j = 1; j <= (rows - i) * 2 + 1; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
