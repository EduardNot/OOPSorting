import java.util.Arrays;

public class InsertionSort extends Sorting implements SortingInterface {
    private Sorting sorting;

    public InsertionSort(int length) {
        super(length);
        this.sorting = new Sorting(length);
    }

    public int[] sort(int[] list) {
        this.sorting.setStartTime();
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
        this.sorting.setEndTime();
        this.sorting.tookTime();
        this.sorting.setSorted(list);
        System.out.println(this.toString());
        return list;
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