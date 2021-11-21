import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class fastest {

    public static int get_depth (int n) {
        int depth = 0;
        int count = 0;

        List<Integer> container = new ArrayList<>();

        while (n != 0) {
            if (n % 2 != 0) {
                n--;
                count++;
            }
            n = n / 2;
            depth++;

        }
        if (count > 0) {
            depth++;
        }

        return depth - 1;
    }


    public static void main(String[] args) {
        System.out.println(get_depth(7));


    }
}