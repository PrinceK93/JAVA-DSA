import java.math.BigInteger;

public class BigType {
    
    public static void main(String[] args) {
        
        BigInteger b = new BigInteger("191291929192192192219291921"); 

        BigInteger b2 = new BigInteger("99999999929192192192219291921"); 
        BigInteger b3 = b.add(b2); 
        System.out.println(b3);
        
    } 
}
