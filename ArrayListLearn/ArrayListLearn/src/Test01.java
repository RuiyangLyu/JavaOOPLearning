import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String temp = i+"";
            arr.add(temp);
        }
        String temp = arr.get((int) (10 * Math.random()));
        System.out.println(temp);
    }
}
