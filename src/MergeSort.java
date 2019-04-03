public class MergeSort extends Sorting implements SortingInterface {

    public MergeSort(int length) {
        super(length);
    }

    public MergeSort(int[] array){
        super(array);
    }

    public MergeSort(){ return; }

    public int[] sort(int[] list){
        setOriginalArray(list);
        setStartTime();
        list = sortCall(list);
        setEndTime();
        tookTime();
        setArrayList(list);
        System.out.println(toString());
        return list;
    }

    public int[] sortCall(int[] list) {

        if (list.length > 1) {
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            sortCall(firstHalf);

            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            sortCall(secondHalf);
            merge(firstHalf, secondHalf, list);
        }

        return list;
    }

    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2]) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }

            while (current1 < list1.length) {
                temp[current3++] = list1[current1++];
            }

            while (current2 < list2.length) {
                temp[current3++] = list2[current2++];
            }
        }
    }
}
