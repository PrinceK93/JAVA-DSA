import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int num = 724272;

        HashMap<Integer, Integer> map = new HashMap<>();
        while (num != 0) {
            int digits = num % 10;
            if (map.get(digits) == null) {
                map.put(digits, 1);
            } else {
                int count = map.get(digits);
                count++;
                map.put(digits, count);
            }
            num = num / 10;
        }
        System.out.println(map);
    }
}
