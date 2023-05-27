import java.util.Scanner;

public class Task0005hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = add(a, b);
        System.out.println("Sum: " + sum);

        int multiply = multiply(a, b);
        System.out.println("Multiplication: " + multiply);
    }

    public static int add(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }

    public static int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (b > 0) {
            int result = a;
            while (b > 1) {
                result = add(result, a);
                b--;
            }
            return result;
        } else {
            return multiply(a, -b);
        }
    }
}
