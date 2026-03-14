import java.util.Arrays;

public class BubbleSortTask {
    public static void main(String[] args) {
        int[] intArray = {5, 1, 4, 2, 8};
        System.out.println("До: " + Arrays.toString(intArray));
        bubbleSort(intArray);
        System.out.println("После: " + Arrays.toString(intArray));
    }
    public static void bubbleSort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }
}