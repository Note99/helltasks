import java.util.Scanner;

public class Task0009hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("arr has only positive elements? " + hasOnlyPositiveElements(array));
        System.out.println("arr has no negative elements? " + hasNoNegativeElements(array));
    }

    public static boolean hasOnlyPositiveElements(int[] array) {
        for (int element : array) {
            if (element <= 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasNoNegativeElements(int[] array) {
        for (int element : array) {
            if (element < 0) {
                return false;
            }
        }
        return true;
    }
}
