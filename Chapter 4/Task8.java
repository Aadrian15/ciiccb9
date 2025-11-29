
You sent
public class Task8 {

    // Method with varargs
    static int sumAll(int... nums) {
        int total = 0;
        for (int n : nums) total += n;
        return total;
    }

    // Cumulative sum method
    static int cumulative(int n) {
        return n * (n + 1) / 2;  // formula for 1+2+...+n
    }

    public static void main(String[] args) {

        int[] values = {4, 5, 10};

        // Print cumulative sum for each parameter
        for (int v : values) {
            System.out.println("Cumulative of " + v + " = " + cumulative(v));
        }

        // Print total sum of all parameters
        System.out.println("Total sum = " + sumAll(values));
    }
}