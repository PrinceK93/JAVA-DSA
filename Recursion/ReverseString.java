public class ReverseString {
    static String reverse(String str){
        if(str.length()==0){
            return "";
        }
        String smallString = reverse(str.substring(1));
        char firstChar = str.charAt(0);
        return smallString + firstChar;

    }

    public static void main(String[] args) {

    String r = reverse("prince");
    System.out.println(r);
    }
}