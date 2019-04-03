public class InsertionSort extends Sorting implements SortingInterface {
    public InsertionSort(int length) {
        super(length);
    }

    public InsertionSort(int[] array){
        super(array);
    }

    public int[] sort(int[] list) {
        setOriginalArray(list);
        setStartTime();
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
        setEndTime();
        tookTime();
        setArrayList(list);
        System.out.println(toString());
        return list;
    }

}