public class Pattern8 {
    public static void main(String[] args) {
        int n = 5; // height and width

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Top, middle, and bottom rows full of stars
                if (row == 1 || row == n || row == (n / 2) + 1) {
                    System.out.print("*");
                }
                // First and last columns for vertical lines
                else if (col == 1 || col == n) {
                    System.out.print("*");
                }
                
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
