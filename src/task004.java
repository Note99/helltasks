public class task004 {
    public static void main(String[] args) {
        int[] numbers = {44, 66, 99, 77, 6541, 22, 55};
        System.out.println("Largest number is: " + getMax(numbers));
    }

    public static int getMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
