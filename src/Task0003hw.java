public class Task0003hw {
    public static void main(String[] args) {
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
        System.out.println(f(4));
    }

    public static double f(int n) {
        double result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.sqrt(2 + result);
        }
        return result;
    }
}
