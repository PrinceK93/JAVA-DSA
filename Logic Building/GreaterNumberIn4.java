public class GreaterNumberIn4 {
   
    public static void main(String[] args) {
        int a = 30, b = 45, c = 220, d = 18;

        int greatest;

        if (a >= b && a >= c && a >= d) {
            greatest = a;
        } else if (b >= a && b >= c && b >= d) {
            greatest = b;
        } else if (c >= a && c >= b && c >= d) {
            greatest = c;
        } else {
            greatest = d;
        }

        System.out.println("Greatest number is: " + greatest);
    }

}
