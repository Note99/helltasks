public class task0001hw {
    public static void main(String[] args) {
        printResult(5);
    }

    public static void printResult(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "    " + Math.pow(i, 2));
        }
    }
}
