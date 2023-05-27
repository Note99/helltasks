public class Task0008hw {
    public static void main(String[] args) {
        int array[] = {65, 15, 66, 108, 9, 12, 10, 50, 155};
        int sum = calculateSum(array);
        System.out.println(sum);
    }

    public static int calculateSum(int[] array) {
        return calculateSumRecursive(array, array.length - 1);
    }

    private static int calculateSumRecursive(int[] array, int index) {
        if (index < 0) {
            return 0;
        }
        return array[index] + calculateSumRecursive(array, index - 1);
    }
}