import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tegemist on sorteerimis programmiga, kus käsitletakse erinevaid sorteerimis " +
                "algoritme.")
        ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mitu array tahate teha?: ");
        int number = scanner.nextInt();

        int[][] arrays = new int[number][];
        for (int i = 0; i < number; i++) {
            System.out.println("Kui pikk massiiv?:");
            int length = scanner.nextInt();
            arrays[i] = Sorting.randomArrayList(length);
        }
        InsertionSort insertionSort = new InsertionSort(500);
        System.out.println(insertionSort.toString());
        System.out.println(Arrays.toString(insertionSort.sort(insertionSort.getArrayList())));
        //System.out.println(Arrays.toString(InsertionSort.sort(arrays[0])));
        /*int[] list = {1, 9, 4, 6, 5, -4};
        System.out.println(Arrays.toString(InsertionSort.sort(list)));
        System.out.println(Arrays.toString(BubbleSort.sort(list)));
        System.out.println(Arrays.toString(MergeSort.sort(list)));
        System.out.println(Arrays.toString(QuickSort.sort(list)));*/
    }
}
