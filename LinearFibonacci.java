import java.io.FileWriter;

public class LinearFibonacci {

    public static long fib(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("linear_fibonacci_output.txt");

        for (int i = 5; i <= 100; i += 5) {
            long startTime = System.nanoTime();
            long result = fib(i);
            long endTime = System.nanoTime();

            long duration = (endTime - startTime);

            System.out.println("Fibonacci(" + i + ") = " + result + ", Time taken: " + duration + " ns");

            writer.write("Fibonacci(" + i + ") = " + result + ", Time taken: " + duration + " ns\n");
        }

        writer.close();
        System.out.println("Output written to linear_fibonacci_output.txt");
    }
}
