import java.util.Scanner;

public class Task7 {
    static int add(int a, int b){ return a + b; }
    static int sub(int a, int b){ return a - b; }
    static int mul(int a, int b){ return a * b; }
    static double div(int a, int b){ return (double) a / b; }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println("Add: " + add(x, y));
            System.out.println("Sub: " + sub(x, y));
            System.out.println("Mul: " + mul(x, y));
            System.out.println("Div: " + div(x, y));
        } // sc is automatically closed here
    }
}