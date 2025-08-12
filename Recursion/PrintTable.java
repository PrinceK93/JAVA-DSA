public class PrintTable {

    static void TablePrint(int num, int i){
        if(i > 10){
            return;
        }
        System.out.println(num + " x " + i + " = " + (num * i));
        TablePrint(num, i+1);
    }
    public static void main(String[] args) {
        int num = 5; //any number  
        TablePrint(num,1);
    }
}