public class PrimeNumber {
    public static void main(String[] args) {
        int num = 17; 
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            // Using a loop to check divisibility
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // No need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is Not a Prime Number.");
        }
    }

}
