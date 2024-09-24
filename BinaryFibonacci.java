import java.io.FileWriter;

public class BinaryFibonacci {
    public static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("fibonacci_output.txt");

        for (int i = 5; i <= 50; i += 5) {
            long startTime = System.nanoTime();
            long result = fib(i);
            long endTime = System.nanoTime();

            long duration = (endTime - startTime);

            System.out.println("Fibonacci(" + i + ") = " + result + ", Time taken: " + duration + " ns");

            writer.write("Fibonacci(" + i + ") = " + result + ", Time taken: " + duration + " ns\n");
        }
        
        writer.close();
        System.out.println("Output written to fibonacci_output.txt");
    }
}
