import java.util.ArrayList;
import java.util.Arrays;

public class ReverseTask {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("До реверса:    " + myList);
        reverse(myList);
        System.out.println("После реверса: " + myList);
    }
    public static void reverse(ArrayList<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(n - i));
            intList.set(n - i, temp);
        }
    }
}