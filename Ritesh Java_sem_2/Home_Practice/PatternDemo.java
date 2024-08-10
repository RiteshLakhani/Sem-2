public class PatternDemo {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        int count = -1;
        for (int i = 0; i < n; i++) {
            int k;
            if (i <= 1) {
                k = i;
            } else {
                k = 2 * i - 1;
            }
            space = k;
            for (int j = 0; j < (2 * n) - space; j++) {
                if (j == (2 * n - 1) / 2 - count) {
                    count++;
                    while (k > 0) {
                        System.out.print("  ");
                        k--;
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
