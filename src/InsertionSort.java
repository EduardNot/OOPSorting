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
        sorting.tookTime();
        return list;
    }
}
