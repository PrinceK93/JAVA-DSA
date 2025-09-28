public class PrintName {

    static void NamePrint(int num){
        if(num==0){
            return;
        } 
        System.out.println("My Name Is Prince "+ num);
         NamePrint(num-1);
    }
// Main 
    public static void main(String[] args) {
       NamePrint(5);
    }
}
