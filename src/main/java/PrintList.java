import java.util.ArrayList;

public class PrintList {
    public static void printList(ArrayList<Integer> list) {
        list.forEach(n -> System.out.println(n));
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        printList(numbers);
    }
}