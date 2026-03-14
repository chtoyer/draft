import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTask {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        System.out.println("До:    " + list);

        for (int i = 0; i < list.size(); i += 2) {
            Collections.swap(list, i, i + 1);
        }
        System.out.println("После: " + list);
    }
}
