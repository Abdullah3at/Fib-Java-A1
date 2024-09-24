public class Fibo {
    public static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) throws Exception {
        java.io.FileWriter writer = new java.io.FileWriter("binary_fib_out.txt");
        
        for (int i = 5; i <= 100; i += 5) {
            long startTime = System.nanoTime(); // Start time
            long result = fib(i);
            long endTime = System.nanoTime();   // End time

            long duration = (endTime - startTime); // Calculate time taken
            writer.write("Fibonacci(" + i + ") = " + result + ", Time taken: " + duration + " ns\n");
        }
        writer.close(); // Save output to file
    }
}
