public class RotateAnum {

    public static void main(String[] args) {
        int num = 32145;
        int rotation = 2;

        int digits = (int) Math.log10(num) + 1;
        rotation = rotation % digits;
        int divisor = (int) Math.pow(10, rotation);
        int multiplier = (int) Math.pow(10, digits - rotation);

        int lastPart = num % divisor;       // Get last 2 digits → 45
        int firstPart = num / divisor;      // Get remaining part → 321
        
        int rotated = lastPart * multiplier + firstPart;
        System.out.println("Rotated number: " + rotated);
        
    }
}
