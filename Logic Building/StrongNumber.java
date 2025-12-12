public class StrongNumber {

    static int fact(int digits) {
        if (digits == 1) {
            return 1;
        } else {
            return digits * fact(digits - 1);
        }
    }
 
    public static void main(String[] args) {
        int num = 145;
        int cpy = num;
        int sum = 0;
        
        while (cpy != 0) {
            int digits = cpy % 10;
            sum = sum + fact(digits); 
            cpy = cpy/10;
        } 
        System.out.println(num == sum?"strong number":"not strong number");
    }
}
