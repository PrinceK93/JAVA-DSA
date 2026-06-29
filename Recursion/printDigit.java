public class printDigit {
    static void printDigit(int num){
        if(num == 0){
            return;  
        } 
         
        printDigit(num/10);
        System.out.println(num%10);

    }
            public static void main(String[] args) {  
          printDigit(12345);
    } 
}
