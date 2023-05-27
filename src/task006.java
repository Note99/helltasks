public class task006 {
    public static void main(String[] args) {
        int[] array = {65, 15, 66, 108, 9, 12, 10, 50, 155};
        int key = 9;
        System.out.println(recursiveSearch(array, key));
        System.out.println(recursiveSearch(array, 10));
        System.out.println(recursiveSearch(array, 15));
        System.out.println(recursiveSearch(array, 150));
    }

    public static boolean recursiveSearch(int[] array, int key) {
        return recursiveSearch(array, 0, array.length - 1, key);
    }

    public static boolean recursiveSearch(int[] array, int left, int right, int key) {
        if (left > right) {
            return false;
        }

        int mid = left + (right - left) / 2;
        if (array[mid] == key) {
            return true;
        } else if (array[mid] > key) {
            return recursiveSearch(array, left, mid - 1, key);
        } else {
            return recursiveSearch(array, mid + 1, right, key);
        }
    }
}
