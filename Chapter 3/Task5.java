import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        s.close();

        if (n1 == n2 && n2 == n3) {
            System.out.println("All numbers are equal");
        } else {
            // Find the maximum of all three numbers in one line
            int largest = Math.max(n1, Math.max(n2, n3));
            System.out.println("The largest number is: " + largest);
        }
    }
}