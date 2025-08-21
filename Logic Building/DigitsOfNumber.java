public class DigitsOfNumber {
    public static void main(String[] args) {
        int num = 123456;
        
        int cpy = num;
        int count = 0;

        while(cpy!=0){
            count++;
            cpy =cpy/10;
        }
        // divide and show the diigt
        while(num!=0){
            int pow =(int)Math.pow(10,count-1);
            System.out.println(num/pow);
            num = num%pow;
            count--;
        }
    }
}
