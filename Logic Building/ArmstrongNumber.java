public class ArmstrongNumber {
    public static void main(String[] args) {
 
        int num = 1;
        int cpy = num;
        int count = 0;
        int sum = 0;

        while (cpy != 0) {
            count++;
            cpy = cpy / 10;
        }
        cpy = num;

        while (cpy != 0) {
            int digits = cpy % 10;
            sum = sum + (int)Math.pow(digits, count);
            cpy = cpy/10;
        }
        System.out.println(num == sum?"Armstrong number":"Not a Armstrong Number");
    }
}
