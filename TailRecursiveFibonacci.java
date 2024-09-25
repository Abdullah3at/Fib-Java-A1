import java.io.FileWriter;

public class TailRecursiveFibonacci {

    public static long fib(int n, long a, long b) {
        if (n == 0) return a;
        if (n == 1) return b;
        return fib(n - 1, b, a + b);
    }

    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("tail_recursive_fibonacci_output.txt");

        for (int i = 5; i <= 100; i += 5) {
            long startTime = System.nanoTime();
            long result = fib(i, 0, 1);
            long endTime = System.nanoTime();

            long duration = (endTime - startTime);

            System.out.println("Fibonacci(" + i + ") = " + result + ", Time taken: " + duration + " ns");

            writer.write("Fibonacci(" + i + ") = " + result + ", Time taken: " + duration + " ns\n");
        }

        writer.close();
        System.out.println("Output written to tail_recursive_fibonacci_output.txt");
    }
}
