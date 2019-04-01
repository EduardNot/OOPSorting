import java.util.Arrays;

public class QuickSort extends Sorting implements SortingInterface {
    private Sorting sorting;

    public QuickSort(int length) {
        super(length);
        this.sorting = new Sorting(length);
    }

    public int[] sort(int[] list) {
        this.sorting.setStartTime();
        quickSort(list, 0, list.length - 1);
        this.sorting.setEndTime();
        this.sorting.tookTime();
        this.sorting.setSorted(list);
        return list;
    }

    public static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            while (low <= high && list[high] > pivot) {
                high--;
            }

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high > first && list[high] >= pivot) {
            high--;
        }

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }
    @Override
    public String toString() {
        if (sorting.getSorted().length > 100) {
            toStirngQuestion();
            if (isToStringAnswer()) {
                return super.toString() + "\nSorteeritud massiiv: " + Arrays.toString(this.sorting.getSorted());
            } else {
                return super.toString() + "\nSortteertud massiiv, millel on " + this.sorting.getSorted().length + " " +
                        "elementi.";
            }
        } else {
            return super.toString() + "\nSorteeritud massiiv: " + Arrays.toString(this.sorting.getSorted());
        }
    }
}
