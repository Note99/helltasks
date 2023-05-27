public class task003 {
    public static void main(String[] args) {
        int[] inputs = {1, 5, 10, 30, 50};
        for (int n : inputs) {
            System.out.println(fib(n));
        }
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int prev1 = 0;
        int prev2 = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }

        return result;
    }
}
