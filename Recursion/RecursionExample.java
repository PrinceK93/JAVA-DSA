public class RecursionExample {

    static int factorial(int n) {
        // Base case: stop recursion
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: call the same method with (n-1)
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
