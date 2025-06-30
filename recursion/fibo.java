package dsaAlgo.recursion;

class fibo {
    public int fibo(int n) {
        // Base cases: F(0) = 0, F(1) = 1
        if (n == 0) return 0;
        if (n == 1) return 1;
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
       fibo solution = new fibo();
        int n = 5; // Example input
        System.out.println("Fibonacci number at position " + n + " is " + solution.fibo(n));
    }
}
