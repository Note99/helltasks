import java.util.Scanner;

public class Task0004hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.println("Number of digits: " + countDigits(n));
        System.out.println("Sum of digits: " + sumDigits(n));
    }

    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    public static int sumDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
