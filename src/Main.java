import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 9, 4, 6, 5, -4};
        System.out.println(Arrays.toString(InsertionSort.sort(list)));
        System.out.println(Arrays.toString(BubbleSort.sort(list)));
        System.out.println(Arrays.toString(MergeSort.sort(list)));
        System.out.println(Arrays.toString(QuickSort.sort(list)));
    }
}
