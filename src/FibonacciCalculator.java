public class FibonacciCalculator {

    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.out.println("Enter a positive integer through the command line.");
            return;
        }

       
        int n;
        try {
            n = Integer.parseInt(args[0]);
            if (n < 0) {
                System.out.println("N has to be a non-negative integer");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a non-negative integer.");
            return;
        }

       
        long fibonacciNumber = fibonacci(n);
        
        // Print result
        System.out.println(fibonacciNumber);
    }

    // Calculate fibonacci number
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long a = 0;
            long b = 1;
            long fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            return fib;
        }
    }
}
