public class Swapdigit {
    public static void main(String[] args) {
        int num = 9246;
        int original = num;

        int digits = (int)Math.log10(num) + 1; // Count digits

        int lastDigit = num % 10;  // Get last digit
        int firstDigit = (int)(num / Math.pow(10, digits - 1)); // Get first digit

        // Remove first digit
        int middle = (int)(num % Math.pow(10, digits - 1));
        // Remove last digit from middle part
        middle = middle / 10;

        // Build the new number
        int swapped = lastDigit * (int)Math.pow(10, digits - 1) + middle * 10 + firstDigit;

        System.out.println("Original Number: " + original);
        System.out.println("Swapped Number: " + swapped);
    }
}
