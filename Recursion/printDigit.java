public class printDigit {

    // Recursive method to print each digit of a number on a new line
    static void printDigit(int num) {

        // Base case:
        // When the number becomes 0, stop the recursion.
        if (num == 0) {
            return;
        }

        // Recursive call:
        // Divide the number by 10 to remove the last digit.
        // This keeps calling the function until the number becomes 0.
        printDigit(num / 10);

        // This statement executes while the recursive calls return.
        // It prints the last digit of the current number.
        // Because printing happens after recursion, digits are printed
        // from left to right instead of right to left.
        System.out.println(num % 10);
    }

    public static void main(String[] args) {

        // Call the function with the number 12345.
        // Expected Output:
        // 1
        // 2
        // 3
        // 4
        // 5
        printDigit(12345);
    }
}