public class Pattern11 {
    public static void main(String[] args) {
        int rows = 5;
        int i=0;

        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i*2-1; k++) {
                if (i == 1 || k == 1 || k == i*2-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        for(int k=1;k<=(i-1)*2-1;k++)
        {
            System.out.print("* ");
        }        
    }
}
