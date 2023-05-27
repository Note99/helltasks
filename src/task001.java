public class task001 {
    public static void main(String[] args) {
        printHello(3);
        System.out.println("End of program");

    }

    public static void printHello(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(i + " Hello!!!");
            System.out.println(i + " Bye");
        }
    }


}

