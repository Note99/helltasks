public class task002 {
    public static void main(String[] args) {
        int[] inputs = {1, 2, 3, 4, 5};
        for (int n : inputs) {
            System.out.println(f(n));
        }
    }

    public static int f(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
