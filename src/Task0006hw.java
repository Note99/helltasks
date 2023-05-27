import java.util.Scanner;

public class Task0006hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int decimal = scanner.nextInt();
        String binary = toBinary(decimal);
        System.out.println("The binary representation of " + decimal + " is " + binary);
    }

    public static String toBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }
}
