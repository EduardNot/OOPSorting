public class BubbleSort extends Sorting implements SortingInterface {
    private Sorting sorting;
    public BubbleSort(int length) {
        super(length);
        this.sorting = new Sorting(length);
    }

    public int[] sort(int[] list) {
        boolean needNextPass = true;
        this.sorting.setStartTime();
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
        }
        this.sorting.setEndTime();
        sorting.tookTime();
        return list;
    }
}
