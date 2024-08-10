class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        } else if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = 1.0;
        double currentProduct = x;

        for (int i = n; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        double x = 2.0;
        int n = -2147483648;
        double result = solution.myPow(x, n);
        System.out.println(result); // Output: 8.0
    }
}
