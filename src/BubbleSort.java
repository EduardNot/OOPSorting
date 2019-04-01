public class BubbleSort extends Sorting implements SortingInterface {
    public BubbleSort(int length) {
        super(length);
    }

    public BubbleSort(int[] array){
        super(array);
    }

    public BubbleSort(){ return; }

    public int[] sort(int[] list) {
        setOriginalArray(list);
        boolean needNextPass = true;
        setStartTime();
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
        setEndTime();
        tookTime();
        System.out.println(toString());
        return list;
    }
}
