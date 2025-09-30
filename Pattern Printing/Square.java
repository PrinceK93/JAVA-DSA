public class Square { 
    public static void main(String[] args) {
        int range = 5;
        //this will print square 
        for(int row = 1 ; row <= range ;row++){
            for(int column = 1 ; column <= range ; column++){ 
                System.out.print("*");
            }
             
            System.out.println();
        }
    }
}
