import java.util.Scanner;

public class Task0002hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        readAndWrite(scanner);
    }

    public static void readAndWrite(Scanner scanner) {
        System.out.print("next num = ");
        int x = scanner.nextInt();
        if (x != 0) {
            readAndWrite(scanner);
            System.out.println(x);
        }
    }
}
