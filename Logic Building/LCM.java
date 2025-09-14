public class LCM {
    public static void main(String[] args) {
        
        int a = 12;
        int b = 24;
        int acpy = a;
        int bcpy = b;

        while(a%b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        
        int lcm = (acpy*bcpy)/b;
        System.out.println(lcm);
    }
}
