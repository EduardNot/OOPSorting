import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 9, 4, 6, 5, -4};
        System.out.println(Arrays.toString(InsertionSort.insertionSort(list)));
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(list)));
    }
}
